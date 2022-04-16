package com.example.listuserapi.model.mapper;


import com.example.listuserapi.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends User {

    private Long id;
    private String username;
    private String fullname;
    private String email;
    private String phonenumber;

    public UserDTO(UserDTO toUserDTO) {

    }
}
