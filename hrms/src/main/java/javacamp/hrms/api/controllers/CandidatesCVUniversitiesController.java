package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CandidatesCVUniversityService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVUniversity;

@RestController
@RequestMapping("api/candidatescvuniversities")
public class CandidatesCVUniversitiesController {
	
	private CandidatesCVUniversityService cvUniversityService;
	
	@Autowired
	public CandidatesCVUniversitiesController(CandidatesCVUniversityService cvUniversityService) {
		super();
		this.cvUniversityService = cvUniversityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidatesCVUniversity>> getall(){
		return this.cvUniversityService.getall();
	}
	
	@GetMapping("/getallbygraduationyearorderbyidasc")
	public DataResult<List<CandidatesCVUniversity>> findByGraduationYearOrderByIdAsc(@RequestParam String id){
		return this.cvUniversityService.findByGraduationYearOrderByIdAsc(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidatesCVUniversity cvUniversity) {
		return this.cvUniversityService.add(cvUniversity);
	}

}
