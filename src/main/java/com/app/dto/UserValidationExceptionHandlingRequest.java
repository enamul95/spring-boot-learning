package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserValidationExceptionHandlingRequest {

    @NotNull(message = "User Name should not be Empty")
    private String name;

    @Email(message = "Please Enter Your Correct Email")
    private String email;

    @NotNull(message = "Mobile Number shouldn't be Empty")
    @Pattern(regexp = "^\\d{11}$",message = "Invalid mobile number entered ")
    private String mobile;

    private String gender;

    @Min(value = 18,message = "Minimum Age should be 18 years")
    @Max(value = 60,message = "Maximum Age should not be more than 60")
    private int age;
    @NotBlank
    private String nationality;
}
