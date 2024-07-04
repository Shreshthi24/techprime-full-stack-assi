package com.techprime.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.techprime.pojo.User;

@EnableJpaRepositories
@Repository
public interface LoginRepo  extends JpaRepository<User,Integer> {

	User findByEmail(String email);
	Optional<User> findOneByEmailandPassword(String email, String password);

}