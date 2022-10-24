package com.app;

import com.app.entity.UserEntity;;
import com.app.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
class SpringBootLearningApplicationTests {

	@Autowired
  private UserRepo userRepo;

	@Test
	public void testCredateUser(){
		UserEntity entity = new UserEntity();
		entity.setId(1l);
		entity.setName("Enamul Haque");
		entity.setUserName("enamul");
		entity.setEmail("enmaul@gmail.com");
		userRepo.save(entity);
		assertNotNull(userRepo.findById(1l));
	}

	@Test
	public void testReadAll() {
		userRepo.findAll();
		assertThat(userRepo.findAll().size() > 0);
	}

	@Test
	public void getSingleProduct(){
		UserEntity userEntity = userRepo.findById(1L).get();
		assertEquals("enamul",userEntity.getUserName());
	}

	@Test
	public void updateUser(){
		UserEntity userEntity = userRepo.findById(1L).get();
		userEntity.setUserName("enam");
		userRepo.save(userEntity);
		assertEquals("enam",userRepo.findById(1L).get().getUserName());
	}


}
