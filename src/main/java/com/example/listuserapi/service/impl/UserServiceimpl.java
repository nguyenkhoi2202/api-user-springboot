package com.example.listuserapi.service.impl;

import com.example.listuserapi.model.User;
import com.example.listuserapi.model.mapper.UserDTO;
import com.example.listuserapi.model.mapper.UserMapper;
import com.example.listuserapi.repository.UserRepository;
import com.example.listuserapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
        List<UserDTO> u = new ArrayList<UserDTO>();
        for (User  user : userRepository.findAll()){
            u.add(UserMapper.toUserDTO(user));
        }
        return u;
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User CreateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        return user;
    }

    @Override
    public User findByUsername(String userName) {
        return userRepository.findByUsername(userName);

    }
}
