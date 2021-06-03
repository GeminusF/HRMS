package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CandidatesCVService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCV;

@RestController
@RequestMapping("api/candidatescv")
public class CandidatesCVController {
	
	private CandidatesCVService candidatesCVService;

	@Autowired
	public CandidatesCVController(CandidatesCVService candidatesCVService) {
		super();
		this.candidatesCVService = candidatesCVService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidatesCV>> getall(){
		return this.candidatesCVService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidatesCV candidatesCV) {
		return this.candidatesCVService.add(candidatesCV);
	}

}
