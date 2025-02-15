package com.example.docker_Demo;


import com.example.docker_Demo.Model.users;
import com.example.docker_Demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test {


    @Autowired
    UserService service;

    @GetMapping("/")
    public String Test(){
        return "Hello world";
    }



    @RequestMapping(value = "/saveUsers",method = RequestMethod.POST)
    public ResponseEntity<users> saveUser(@RequestBody users user){
        System.out.println("******************************* "+user.getEmail());
        service.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
