package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVJobExperience;

public interface CandidatesCVJobExperienceService {

	DataResult<List<CandidatesCVJobExperience>> getall();
	
	Result add(CandidatesCVJobExperience cvJobExperience);
}
