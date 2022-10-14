package com.example.its.domain.auth;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public List<User> findAll(){
    return userRepository.findAll();
  }

  public void create(String username, String password){
    var encodedPassword = passwordEncoder.encode(password);
    userRepository.insert(username,encodedPassword);
  }

}
