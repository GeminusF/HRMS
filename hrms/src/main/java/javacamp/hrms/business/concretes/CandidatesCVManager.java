package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesCVService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesCVDao;
import javacamp.hrms.entities.concretes.CandidatesCV;

@Service
public class CandidatesCVManager implements CandidatesCVService{
		
	private CandidatesCVDao candidatesCVDao;
	
	@Autowired
	public CandidatesCVManager(CandidatesCVDao candidatesCVDao) {
		super();
		this.candidatesCVDao = candidatesCVDao;
	}

	@Override
	public DataResult<List<CandidatesCV>> getall() {
		return new SuccessDataResult<List<CandidatesCV>>(this.candidatesCVDao.findAll(), "Namizədlərin CVləri siyahılandı");
	}

	@Override
	public Result add(CandidatesCV candidatesCV) {
		this.candidatesCVDao.save(candidatesCV);
		return new SuccessResult("Namizəd CVni daxil elədi");
	}

}
