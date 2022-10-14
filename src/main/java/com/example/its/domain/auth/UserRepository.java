package com.example.its.domain.auth;

import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {

  @Select("SELECT * FROM users WHERE username = #{username}")
  Optional<User> findByUsername(String username);
}
