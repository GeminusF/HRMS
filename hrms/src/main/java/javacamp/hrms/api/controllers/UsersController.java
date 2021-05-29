package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.User;

@RestController
@RequestMapping("api/users")
public class UsersController {
	
	UserService usersService;
	
	@Autowired
	public UsersController(UserService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getall(){
		return this.usersService.getall();
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody User users) {
		return this.usersService.register(users);
	}

}
