package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javacamp.hrms.business.abstracts.JobVacancyService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobVacancy;

@RestController
@RequestMapping("api/jobvacancies")
@CrossOrigin
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
	@RequestMapping(value="/isactive/setisactivefalse", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void setIsActiveFalse() {
		this.jobVacancyService.setIsActiveFalse();
	}

}
