package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesCVForeignLanguageService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesCVForeignLanguageDao;
import javacamp.hrms.entities.concretes.CandidatesCVForeignLanguage;

@Service
public class CandidatesCVForeignLanguageManager implements CandidatesCVForeignLanguageService {
	
	private CandidatesCVForeignLanguageDao candidatesCVForeignLanguageDao;
	
	@Autowired
	public CandidatesCVForeignLanguageManager(CandidatesCVForeignLanguageDao candidatesCVForeignLanguageDao) {
		super();
		this.candidatesCVForeignLanguageDao = candidatesCVForeignLanguageDao;
	}

	@Override
	public DataResult<List<CandidatesCVForeignLanguage>> getall() {
		return new SuccessDataResult<List<CandidatesCVForeignLanguage>>(this.candidatesCVForeignLanguageDao.findAll(), "Namizədlərin CV dilləri siyahılandı");
	}

	@Override
	public Result add(CandidatesCVForeignLanguage cvForeignLanguage) {
		this.candidatesCVForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult("Yeni CV dili əlavə olundu");
	}

}
