package com.app.serviceImpl;

import com.app.responseModel.UserResponse;
import com.app.service.UerService;
import org.springframework.stereotype.Service;

@Service
public class UerServiceImplV2 implements UerService {

    @Override
    public UserResponse getUser() {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(1);
        userResponse.setName("Enamul");
        userResponse.setUserName("era");
        userResponse.setEmail("era@gmail.com");
        return userResponse;
    }
}