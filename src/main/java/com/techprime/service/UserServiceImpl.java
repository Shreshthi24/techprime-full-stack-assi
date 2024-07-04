//package com.techprime.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.techprime.Repo.LoginRepo;
//import com.techprime.dao.LoginDao;
//import com.techprime.dao.UserDao;
//import com.techprime.pojo.User;
//import com.techprime.response.LoginResponse;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//	    @Autowired
//	    private LoginRepo loginRepo;
//	    @Autowired
//	    private PasswordEncoder passwordEncoder;
//
//	@Override
//	public String addUser(UserDao userDao) {
//		 User user = new User(
//				 userDao.getEmployeeid(),
//	               userDao.getEmail(),
//	               this.passwordEncoder.encode(userDao.getPassword())
//	               );
//	        loginRepo.save(user);
//	        return user.getEmail();
//	    }
//	    UserDao userDao;
//	
//
//	@Override
//	public LoginResponse loginResponse(LoginDao loginDao) {
//		 String msg = "";
//	        User user1 = loginRepo.findByEmail(loginDao.getEmail());
//	        if (user1 != null) {
//	            String password = loginDao.getPassword();
//	            String encodedPassword = user1.getPassword();
//	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
//	            if (isPwdRight) {
//	                Optional<User> employee = loginRepo.findOneByEmailandPassword(loginDao.getEmail(), encodedPassword);
//	                if (employee.isPresent()) {
//	                    return new LoginResponse("Login Success", true);
//	                } else {
//	                    return new LoginResponse("Login Failed", false);
//	                }
//	            } else {
//	                return new LoginResponse("password Not Match", false);
//	            }
//	        }else {
//	            return new LoginResponse("Email not exits", false);
//	        }
//	}
//
//
//}
