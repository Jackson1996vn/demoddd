package com.example.demoddd.application.rest;

import com.example.demoddd.application.request.CreateUserRequest;
import com.example.demoddd.application.response.CreateUserResponse;
import com.example.demoddd.application.response.GetUserResponse;
import com.example.demoddd.domain.entity.User;
import com.example.demoddd.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody final CreateUserRequest request) {
        CreateUserResponse response = new CreateUserResponse();
        response.setMessage("Success");
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GetUserResponse> getUser(@RequestParam final Long id) {
        Optional<User> userOptional = userService.getUserById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            GetUserResponse response = new GetUserResponse();
            response.setId(user.getId());
            response.setName(user.getName());
            response.setAge(user.getAge());
            response.setGender(user.getGender());
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.badRequest().body(null);
    }
}
