package loja.tenis.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import loja.tenis.models.User;
import loja.tenis.services.UserServices;

@RestController
@RequestMapping("/api/User")
public class UserControllers {
    @Autowired
    private UserServices UserServices;

    @GetMapping
    public List<User> getAllUser() {
        return UserServices.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable UUID id) {
        return UserServices.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User User) {
        return UserServices.createUser(User);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable UUID id, @RequestBody User User) {
        return UserServices.updateUser(User);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        UserServices.deleteUser(id);
    }

    
}
