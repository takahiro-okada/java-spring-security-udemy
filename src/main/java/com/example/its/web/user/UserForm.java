package com.example.its.web.user;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserForm {

  @NotBlank
  private String username;

  @NotBlank
  private String password;
}
