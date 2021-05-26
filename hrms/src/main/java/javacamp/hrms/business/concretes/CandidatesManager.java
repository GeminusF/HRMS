package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesDao;
import javacamp.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService{
	
	private CandidatesDao candidatesDao;
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}

	@Override
	public DataResult<List<Candidates>> getall() {
		return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll(), "Namizədlər siyahılandı");
	}

	@Override
	public Result register(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Yeni namizəd qeydiyyatdan keçdi");
	}

}
