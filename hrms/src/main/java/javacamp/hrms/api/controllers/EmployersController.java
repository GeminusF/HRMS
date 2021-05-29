package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.EmployerService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("api/employers")
public class EmployersController {
	
	private EmployerService employersService;
	
	@Autowired
	public EmployersController(EmployerService employersService) {
		super();
		this.employersService = employersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getall(){
		return this.employersService.getall();
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody Employer employers) {
		return this.employersService.register(employers);
	}

}
