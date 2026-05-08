package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    

    @Autowired
    UserRepository userRepository;

    public List<UserModel> getAllUsers(){
        return userRepository.findAll();
    }

    public UserModel addNewUser(UserModel user){
        return userRepository.save(user);
    }

    public UserModel getById(Long id){
        return userRepository.findById(id).get();
    }

}
