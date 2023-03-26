package com.souz.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginModel {
    @NotNull
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters")
    private String username;

    
    @NotNull
    @Size(min = 3, max = 15, message = "Password must be between 3 and 15 characters")
    private String password;

}
