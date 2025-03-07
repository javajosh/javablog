package com.javajosh.javablog.controllers;

import com.javajosh.javablog.services.User;
import com.javajosh.javablog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired private UserService userService;

  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> registerUser(@RequestBody User user) {
    User registeredUser = userService.registerUser(user);
    return ResponseEntity.ok(registeredUser);
  }

  @GetMapping(value = "/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> getUser(@PathVariable String username) {
    User user = userService.findByUsername(username);
    if (user != null) {
      return ResponseEntity.ok(user);
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
