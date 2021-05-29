package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.EmployerService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.EmployerDao;
import javacamp.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employersDao;
	
	@Autowired
	public EmployerManager(EmployerDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employer>> getall() {
		return new SuccessDataResult<List<Employer>>(this.employersDao.findAll(), "İşəgötürənlər siyahılandı");
	}

	@Override
	public Result register(Employer employers) {
		this.employersDao.save(employers);
		return new SuccessResult("Yeni işəgötürən qeydiyyatdan keçdi");
	}

}
