package kz.itstep.springboot1.controller;


import kz.itstep.springboot1.model.User;
import kz.itstep.springboot1.repositories.UserRepository;
import kz.itstep.springboot1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/")
    public List<User> getHello(){
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<User> getUserById(@PathVariable Long id ) {
        return userService.getUserById(id);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username ) {
        return userService.getUserByUsername(username);
    }

    @PostMapping("/")
    public User createUser(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password,
            @RequestParam(name = "id") Long id) {
        return userService.createByUser(new User(id ,username, password));
    }

    @PostMapping("/create")
    public User addUser( @RequestBody User user){
        return userService.createByUser(user);
    }
}
