package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesCVUniversityService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesCVUniversityDao;
import javacamp.hrms.entities.concretes.CandidatesCVUniversity;

@Service
public class CandidatesCVUniversityManager implements CandidatesCVUniversityService {
	
	private CandidatesCVUniversityDao cvUniversityDao;
	
	@Autowired
	public CandidatesCVUniversityManager(CandidatesCVUniversityDao cvUniversityDao) {
		super();
		this.cvUniversityDao = cvUniversityDao;
	}

	@Override
	public DataResult<List<CandidatesCVUniversity>> getall() {
		return new SuccessDataResult<List<CandidatesCVUniversity>>(this.cvUniversityDao.findAll(), "Namizəd CV universitetləri siyahılandı");
	}

	@Override
	public Result add(CandidatesCVUniversity cvUniversity) {
		this.cvUniversityDao.save(cvUniversity);
		return new SuccessResult("Yeni CV universteti əlavə olundu");
	}

	@Override
	public DataResult<List<CandidatesCVUniversity>> findByGraduationYearOrderByIdAsc(String id) {
		return new SuccessDataResult<List<CandidatesCVUniversity>>(this.cvUniversityDao.findByGraduationYearOrderByIdAsc(id),"Namizəd CV universitetləri məzuniyyət ilinə görə siyahılandı");
	}


	
	
	
}
