package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.CandidatesCVForeignLanguage;

public interface CandidatesCVForeignLanguageService {

	DataResult<List<CandidatesCVForeignLanguage>> getall();
	
	Result add(CandidatesCVForeignLanguage cvForeignLanguage);
	
}
