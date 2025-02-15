package com.example.docker_Demo.Service;


import com.example.docker_Demo.Model.users;
import com.example.docker_Demo.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {



    @Autowired
    public UserRepository userRepository;

    public boolean saveUser(users users){
         userRepository.save(users);
         return  true;
    }
}
