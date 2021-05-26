package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobTitles;

public interface JobTitlesService {
	DataResult<List<JobTitles>> getAll();
	
	Result add(JobTitles jobTitles);
}
