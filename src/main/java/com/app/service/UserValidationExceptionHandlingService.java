package com.app.service;

import com.app.dto.UserValidationExceptionHandlingRequest;
import com.app.entity.UserValidationExceptionHandlingEntity;
import com.app.exceptionHandler.UserNotFoundException;

import java.util.List;

public interface UserValidationExceptionHandlingService {

    public UserValidationExceptionHandlingEntity saveUser(UserValidationExceptionHandlingRequest request);

    public List<UserValidationExceptionHandlingEntity> getALlUsers();

    public UserValidationExceptionHandlingEntity getUser(Long id) throws UserNotFoundException;
}
