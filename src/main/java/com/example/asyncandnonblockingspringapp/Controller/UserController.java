package com.example.asyncandnonblockingspringapp.Controller;


import com.example.asyncandnonblockingspringapp.Entity.User;
import com.example.asyncandnonblockingspringapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsersFromList")
    public List<User> getAllUsers(){

      return userService.getAllUsers();
    }

    @GetMapping(value ="/allUsersFromFlux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getAllUsersStream(){

        return userService.getAllUsersStream();
    }
}
