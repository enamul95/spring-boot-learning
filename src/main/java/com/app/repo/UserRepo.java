package com.app.repo;

import com.app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<UserEntity,Long> {
    //public UserEntity findById(long id);
}
