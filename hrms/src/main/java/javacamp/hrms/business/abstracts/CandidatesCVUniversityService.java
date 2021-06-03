package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVUniversity;

public interface CandidatesCVUniversityService {

	DataResult<List<CandidatesCVUniversity>> getall();
	
	Result add(CandidatesCVUniversity cvUniversity);
}
