package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidateService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidateDao;
import javacamp.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidatesDao;


	@Autowired
	public CandidateManager(CandidateDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;

	}

	@Override
	public DataResult<List<Candidate>> getall() {
		return new SuccessDataResult<List<Candidate>>(this.candidatesDao.findAll(), "Namizədlər siyahılandı");
	}

	@Override
	public Result register(Candidate candidates) {
		// this.mernisServiceAdapter.checkIfRealTcNo(candidates);
		this.candidatesDao.save(candidates);
		return new SuccessResult("Yeni namizəd qeydiyyatdan keçdi");


	}

}
