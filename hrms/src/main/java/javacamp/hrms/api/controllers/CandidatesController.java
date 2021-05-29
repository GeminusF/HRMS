package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CandidateService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("api/candidates")
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
