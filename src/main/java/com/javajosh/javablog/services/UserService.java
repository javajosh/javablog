package com.javajosh.javablog.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;
//  private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

  public User registerUser(User user) {
//    user.setPasswordHash(passwordEncoder.encode(user.getPasswordHash()));
    user.setPasswordHash("12345");
    return userRepository.save(user);
  }

  public User findByUsername(String username) {
    return userRepository.findByUsername(username);
  }
}
