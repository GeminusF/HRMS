package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesCVJobExperienceService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesCVJobExperienceDao;
import javacamp.hrms.entities.concretes.CandidatesCVJobExperience;

@Service
public class CandidatesCVJobExperienceManager implements CandidatesCVJobExperienceService{

	private CandidatesCVJobExperienceDao cvJobExperienceDao;
	
	@Autowired
	public CandidatesCVJobExperienceManager(CandidatesCVJobExperienceDao cvJobExperienceDao) {
		super();
		this.cvJobExperienceDao = cvJobExperienceDao;
	}

	@Override
	public DataResult<List<CandidatesCVJobExperience>> getall() {
		return new SuccessDataResult<List<CandidatesCVJobExperience>>(this.cvJobExperienceDao.findAll(), "Namizədlərin CV iş təcrübələri siyahılandı");
	}

	@Override
	public Result add(CandidatesCVJobExperience cvJobExperience) {
		this.cvJobExperienceDao.save(cvJobExperience);
		return new SuccessResult("CV iş təcrübəsi əlavə olundu");
	}

}
