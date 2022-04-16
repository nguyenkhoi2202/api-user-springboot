package com.example.listuserapi.controller;

import com.example.listuserapi.model.ResponseObject;
import com.example.listuserapi.model.User;
import com.example.listuserapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUser(){
        List u =  userService.findAll();
        if(u.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("faild", "Get user not successfull!!!", "")
            );
        }else{
            return ResponseEntity.ok(u);
        }
    }
    @PostMapping("/users")
    public ResponseEntity<?> create(@RequestBody User user){
        User u = userService.CreateUser(user);
        if(u == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("faild", "Create user not successfull!!!", "")
            );
        }else{
            return ResponseEntity.ok(u);
        }

    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> removeUser(@PathVariable(name = "id") Long id){
        User user = userService.deleteUser(id);
        return ResponseEntity.ok(user);
    }



}
