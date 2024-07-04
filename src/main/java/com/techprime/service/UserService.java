package com.techprime.service;

import com.techprime.dao.LoginDao;
import com.techprime.dao.UserDao;
import com.techprime.response.LoginResponse;

public interface UserService {
	 String addUser(UserDao userDao);
	 LoginResponse loginResponse(LoginDao loginDao);
	//String addEmployee(UserDao userDao);
	//LoginResponse login(LoginDao loginDao);

}
