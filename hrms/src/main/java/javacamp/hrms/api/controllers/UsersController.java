package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.UsersService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Users;

@RestController
@RequestMapping("api/users")
public class UsersController {
	
	UsersService usersService;
	
	@Autowired
	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Users>> getall(){
		return this.usersService.getall();
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody Users users) {
		return this.usersService.register(users);
	}

}
