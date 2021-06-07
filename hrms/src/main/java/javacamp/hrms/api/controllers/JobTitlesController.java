package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javacamp.hrms.business.abstracts.JobTitleService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobTitle;

@RestController 
@RequestMapping("/api/job_titles")
@CrossOrigin
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
