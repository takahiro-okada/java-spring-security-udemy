package com.example.its.web.user;

import com.example.its.web.validation.UniqueUsername;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserForm {

  @NotBlank
  @UniqueUsername
  private String username;

  @NotBlank
  private String password;
}
