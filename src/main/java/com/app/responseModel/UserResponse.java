package com.app.responseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private long id;

    private String name;
    private String userName;
    private String email;


}
