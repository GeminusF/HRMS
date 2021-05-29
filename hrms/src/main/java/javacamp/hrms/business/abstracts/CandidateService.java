package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
	DataResult<List<Candidate>> getall();
	
	Result register(Candidate candidates);
}
