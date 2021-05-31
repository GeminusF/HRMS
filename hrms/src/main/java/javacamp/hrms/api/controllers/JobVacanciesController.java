package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobVacancyService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobVacancy;

@RestController
@RequestMapping("api/jobvacancies")
public class JobVacanciesController {

	private JobVacancyService jobVacancyService;

	@Autowired
	public JobVacanciesController(JobVacancyService jobVacancyService) {
		super();
		this.jobVacancyService = jobVacancyService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobVacancy>> getall() {
		return this.jobVacancyService.getall();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobVacancy jobVacancy) {
		return this.jobVacancyService.add(jobVacancy);
	}

	@GetMapping("/isactive/active")
	public DataResult<List<JobVacancy>> findByIsActiveTrue() {
		return this.jobVacancyService.findByIsActiveTrue();
	}

	@GetMapping("/isactive/passive")
	public DataResult<List<JobVacancy>> findByIsActiveFalse() {
		return this.jobVacancyService.findByIsActiveFalse();
	}

	@GetMapping("/isactive/active/orderedbyreleasedateasc")
	public DataResult<List<JobVacancy>> findByIsActiveTrueOrderByReleaseDateAsc() {
		return this.jobVacancyService.findByIsActiveTrueOrderByReleaseDateAsc();
	}
	
	@GetMapping("/isactive/active/orderedbycompanyname")
	public DataResult<List<JobVacancy>> findByIsActiveTrueOrderByCompanyName(){
		return this.jobVacancyService.findByIsActiveTrueOrderByCompanyName();
	}
	@PutMapping("/isactive/setisactivefalse")
	public void setIsActiveFalse() {
		this.jobVacancyService.setIsActiveFalse();
	}

}
