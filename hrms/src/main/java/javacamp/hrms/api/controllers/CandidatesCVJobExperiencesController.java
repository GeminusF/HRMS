package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CandidatesCVJobExperienceService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVJobExperience;

@RestController
@RequestMapping("api/candidatescvjobexperiences")
public class CandidatesCVJobExperiencesController {

	private CandidatesCVJobExperienceService cvJobExperienceService;
	
	@Autowired
	public CandidatesCVJobExperiencesController(CandidatesCVJobExperienceService cvJobExperienceService) {
		super();
		this.cvJobExperienceService = cvJobExperienceService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<CandidatesCVJobExperience>> getall(){
		return this.cvJobExperienceService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidatesCVJobExperience cvJobExperience) {
		return this.cvJobExperienceService.add(cvJobExperience);
	}
}
