package com.techprime.project.management.service;


import com.techprime.project.management.dao.LoginDao;
import com.techprime.project.management.dao.UserDao;
import com.techprime.project.management.response.LoginResponse;

public interface UserService {
	 String addUser(UserDao userDao);
	 LoginResponse loginResponse(LoginDao loginDao);
	//String addEmployee(UserDao userDao);
	//LoginResponse login(LoginDao loginDao);

}
