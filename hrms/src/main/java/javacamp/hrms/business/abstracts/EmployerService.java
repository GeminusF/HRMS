package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getall();
	
	Result register(Employer employers);
}
