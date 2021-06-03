package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCV;

public interface CandidatesCVService {
	
	DataResult<List<CandidatesCV>> getall();
	
	Result add(CandidatesCV candidatesCV);
}
