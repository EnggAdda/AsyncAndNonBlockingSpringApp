package com.example.asyncandnonblockingspringapp.Service;

import com.example.asyncandnonblockingspringapp.Dao.UserDao;
import com.example.asyncandnonblockingspringapp.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers(){

       return  userDao.getAllUsers();
    }

    public Flux<User> getAllUsersStream(){

        return  userDao.getAllUsersStream();
    }
}
