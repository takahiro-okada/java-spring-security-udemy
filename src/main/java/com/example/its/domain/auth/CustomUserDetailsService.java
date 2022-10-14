package com.example.its.domain.auth;

import java.util.Collections;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor //Custructorを自動生成
public class CustomUserDetailsService implements UserDetailsService {

  private final UserRepository userRepository;



  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return userRepository.findByUsername(username)
        .map(
            user -> new CustomUserDetails(
                user.getUsername(),
                user.getPassword(),
                Collections.emptyList()
            )
        )
        .orElseThrow(
            () -> new UsernameNotFoundException(
                "Given username is not found. (username = `" + username + "')"
            )
        );
  }
}
