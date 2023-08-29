package com.example.simplejavaapi.controllers;

import com.example.simplejavaapi.FakeDB;
import com.example.simplejavaapi.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {
    public FakeDB fakeDB = new FakeDB();
    @GetMapping
    public List<User> userList(){
        return fakeDB.listAllUsers();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return fakeDB.addUser(user);
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        return fakeDB.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        fakeDB.deleteUser(id);
    }
}
