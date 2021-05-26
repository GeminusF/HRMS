package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Candidates;

public interface CandidatesService {
	
	DataResult<List<Candidates>> getall();
	
	Result register(Candidates candidates);
}
