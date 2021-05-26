package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Employers;

public interface EmployersService {

	DataResult<List<Employers>> getall();
	
	Result register(Employers employers);
}
