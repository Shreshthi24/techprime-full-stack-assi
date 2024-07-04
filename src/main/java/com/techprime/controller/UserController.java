//package com.techprime.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.techprime.dao.LoginDao;
//import com.techprime.dao.UserDao;
//import com.techprime.response.LoginResponse;
//import com.techprime.service.UserService;
//
//
//@RestController
//@CrossOrigin
//@RequestMapping("/user")
//public class UserController {
//	
//	 @Autowired
//	   private UserService userService;
//	 
//	    @PostMapping("/save")
//	    public String saveEmployee(@RequestBody UserDao userDao)
//	    {
//	    	System.out.println("inside saveEmployee : "+userDao);
//	        String id = userService.addUser(userDao);
//	        return id;
//	    }
//	    
//	    @PostMapping(path = "login")
//	    public ResponseEntity<?> login(@RequestBody LoginDao loginDao)
//	    {
//	    	System.out.println("login req : "+loginDao);
//	    	LoginResponse loginResponse = userService.loginResponse(loginDao);
//	        return ResponseEntity.ok(loginResponse);
//	    }
//	    
//	    
//	    @GetMapping("/")
//	    public String getString()
//	    {
//	 
//	        return "Rerurned string";
//	    }
//}
