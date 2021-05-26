package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.EmployersService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.EmployersDao;
import javacamp.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService {
	
	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employers>> getall() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(), "İşəgötürənlər siyahılandı");
	}

	@Override
	public Result register(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult("Yeni işəgötürən qeydiyyatdan keçdi");
	}

}
