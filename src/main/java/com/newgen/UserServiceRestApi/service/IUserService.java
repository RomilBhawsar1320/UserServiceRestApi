package com.newgen.UserServiceRestApi.service;

import com.newgen.UserServiceRestApi.dto.UserDto;
import com.newgen.UserServiceRestApi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);


}
