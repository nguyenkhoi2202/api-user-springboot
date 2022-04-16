package com.example.listuserapi.model.mapper;

import com.example.listuserapi.model.User;

public class UserMapper {

    public static UserDTO toUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setFullname(user.getFullname());
        userDTO.setPhonenumber(user.getPhonenumber());
         return userDTO;

    }
}