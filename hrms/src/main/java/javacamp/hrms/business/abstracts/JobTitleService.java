package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	
	Result add(JobTitle jobTitles);
}
