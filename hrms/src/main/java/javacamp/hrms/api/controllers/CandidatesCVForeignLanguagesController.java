package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CandidatesCVForeignLanguageService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVForeignLanguage;

@RestController
@RequestMapping("api/candidatescvforeignlanguages")
public class CandidatesCVForeignLanguagesController {
	
	private CandidatesCVForeignLanguageService cvForeignLanguageService;
	
	@Autowired
	public CandidatesCVForeignLanguagesController(CandidatesCVForeignLanguageService cvForeignLanguageService) {
		super();
		this.cvForeignLanguageService = cvForeignLanguageService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<CandidatesCVForeignLanguage>> getall(){
		return this.cvForeignLanguageService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidatesCVForeignLanguage cvForeignLanguage) {
		return this.cvForeignLanguageService.add(cvForeignLanguage);
	}
	
	
	

}
