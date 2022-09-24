package com.app.repo;

import com.app.entity.UserValidationExceptionHandlingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserValidationExceptionHandlingRepo extends JpaRepository<UserValidationExceptionHandlingEntity,Long> {


    UserValidationExceptionHandlingEntity findByUserId(Long id);

}
