package com.app.serviceImpl;

import com.app.dto.UserValidationExceptionHandlingRequest;
import com.app.entity.UserValidationExceptionHandlingEntity;
import com.app.exceptionHandler.UserNotFoundException;
import com.app.repo.UserValidationExceptionHandlingRepo;
import com.app.service.UserValidationExceptionHandlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserValidationExceptionHandlingServiceImpl  implements UserValidationExceptionHandlingService {



    @Autowired
    private UserValidationExceptionHandlingRepo repo;

    @Override
    public UserValidationExceptionHandlingEntity saveUser(UserValidationExceptionHandlingRequest request) {

        UserValidationExceptionHandlingEntity entity =  UserValidationExceptionHandlingEntity.build(
               0l,
                request.getName(),
                request.getEmail(),
                request.getMobile(),
                request.getGender(),
                request.getAge(),
                request.getNationality()
        );

        return repo.save(entity);
    }

    @Override
    public List<UserValidationExceptionHandlingEntity> getALlUsers() {
        return repo.findAll();
    }

    @Override
    public UserValidationExceptionHandlingEntity getUser(Long id) throws UserNotFoundException {
        UserValidationExceptionHandlingEntity user= repo.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : "+id);
        }

    }
}
