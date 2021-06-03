package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVTechTool;

public interface CandidatesCVTechToolService {

	DataResult<List<CandidatesCVTechTool>> getall();
	
	Result add(CandidatesCVTechTool cvTechTool);
}
