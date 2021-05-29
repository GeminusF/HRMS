package javacamp.hrms.business.abstracts;


import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.JobVacancy;

public interface JobVacancyService {

	DataResult<List<JobVacancy>> getall();
	
	Result add(JobVacancy jobVacancy);
}
