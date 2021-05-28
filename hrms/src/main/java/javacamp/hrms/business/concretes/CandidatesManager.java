package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.core.adapters.mernis.MernisServiceAdapter;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.ErrorResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.core.utilities.validators.MailValidateManager;
import javacamp.hrms.dataAccess.abstracts.CandidatesDao;
import javacamp.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private MernisServiceAdapter mernisServiceAdapter;
	private MailValidateManager mailValidator;

	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, MernisServiceAdapter mernisServiceAdapter,
			MailValidateManager mailValidator) {
		super();
		this.candidatesDao = candidatesDao;
		this.mernisServiceAdapter = mernisServiceAdapter;
		this.mailValidator = mailValidator;
	}

	@Override
	public DataResult<List<Candidates>> getall() {
		return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll(), "Namizədlər siyahılandı");
	}

	@Override
	public Result register(Candidates candidates) {
		// this.mernisServiceAdapter.checkIfRealTcNo(candidates);
		this.candidatesDao.save(candidates);
		if (this.mailValidator.isMail(candidates) == true) {
			return new SuccessResult("Yeni namizəd qeydiyyatdan keçdi");
		} else {
			return new ErrorResult("Yanlış məlumatlar");
			
		}

	}

}
