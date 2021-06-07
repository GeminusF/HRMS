package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javacamp.hrms.business.abstracts.CandidateService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("api/candidates")
@CrossOrigin
public class CandidatesController {
	
	private CandidateService candidatesService;
	
	@Autowired
	public CandidatesController(CandidateService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getall(){
		return this.candidatesService.getall();
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody Candidate candidates) {
		return this.candidatesService.register(candidates);
	}
	
	

}
