package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CandidatesCVTechToolService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVTechTool;

@RestController
@RequestMapping("api/candidatescvtechtools")
public class CandidatesCVTechToolsController {
	
	private CandidatesCVTechToolService cvTechToolService;
	
	@Autowired
	public CandidatesCVTechToolsController(CandidatesCVTechToolService cvTechToolService) {
		super();
		this.cvTechToolService = cvTechToolService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidatesCVTechTool>> getall() {
		return this.cvTechToolService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidatesCVTechTool cvTechTool) {
		return this.cvTechToolService.add(cvTechTool);
	}

}
