package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javacamp.hrms.business.abstracts.EmployerService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("api/employers")
@CrossOrigin
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
