package dio.web.api.controller;


import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User> getUser() {
        return repository.findAll();
    }

    @GetMapping("/users/{username}")
    public User getOne(@PathVariable("username") String userName) {
        return repository.findByUsername(userName);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

}
