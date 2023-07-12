package com.renocrewsolutions.certgenerator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.renocrewsolutions.certgenerator.entity.User;

@Controller
public class UserController {
	
	
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@GetMapping("/users")
	@ResponseBody
	public String getUser()
	{
	
	 //only checking
	 // 	User user=new User();
//		user.setName("xyz");
//		user.setEmail("xyz@gamil.com");
//		user.setPassword("xyz123");
//		user.setRole("Intern"); */
	
		return "testing";
		
	}
	

}
