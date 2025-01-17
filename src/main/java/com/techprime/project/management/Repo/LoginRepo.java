package com.techprime.project.management.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.techprime.project.management.pojo.User;


@EnableJpaRepositories
@Repository
public interface LoginRepo  extends JpaRepository<User,Integer> {

	User findByEmail(String email);
	Optional<User> findOneByEmailAndPassword(String email, String password);

}
