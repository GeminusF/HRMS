package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobTitleService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobTitle;

@RestController 
@RequestMapping("/api/job_titles")
public class JobTitlesController {
	
	private JobTitleService jobTitlesService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return this.jobTitlesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitles) {
		return this.jobTitlesService.add(jobTitles);
	}
	
}
