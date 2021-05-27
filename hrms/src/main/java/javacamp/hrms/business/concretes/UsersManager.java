package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.UsersService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.UsersDao;
import javacamp.hrms.entities.concretes.Users;

@Service
public class UsersManager implements UsersService {
	
	private UsersDao usersDao;
	
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	@Override
	public DataResult<List<Users>> getall() {
		return new SuccessDataResult<List<Users>>(this.usersDao.findAll(), "İstifadəçilər siyahılandı");
	}

	@Override
	public Result register(Users users) {
		this.usersDao.save(users);
		return new SuccessResult("Yeni istifadəçi qeydiyyatdan keçdi");
	}

}
