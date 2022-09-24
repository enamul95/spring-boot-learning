package com.app.comtroller;

import com.app.dto.UserValidationExceptionHandlingRequest;
import com.app.entity.UserValidationExceptionHandlingEntity;
import com.app.exceptionHandler.UserNotFoundException;
import com.app.service.UserValidationExceptionHandlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user/validation/excepiton/")
public class UserValidationExceptionHandlingController {

    @Autowired
    private UserValidationExceptionHandlingService service;

    @PostMapping("/signup")
    public ResponseEntity<UserValidationExceptionHandlingEntity> saveUser(@RequestBody @Valid UserValidationExceptionHandlingRequest userRequest){
        return new ResponseEntity<>(service.saveUser(userRequest), HttpStatus.CREATED);
    }


    @GetMapping("/fetchAll")
    public ResponseEntity<List<UserValidationExceptionHandlingEntity>> getAllUsers(){
        return ResponseEntity.ok(service.getALlUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserValidationExceptionHandlingEntity> getUser(@PathVariable Long id) throws UserNotFoundException {
        return ResponseEntity.ok(service.getUser(id));
    }
}
