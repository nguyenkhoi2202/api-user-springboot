package com.example.listuserapi.service;

import com.example.listuserapi.model.User;
import com.example.listuserapi.model.mapper.UserDTO;

import java.util.List;

public interface UserService {
    public List<UserDTO> findAll();
    public User findUserById(Long id);
    public User CreateUser(User user);
    public User deleteUser(Long id);
    public User findByUsername(String userName);
}
