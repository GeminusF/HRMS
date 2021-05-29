package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.UserDao;
import javacamp.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao usersDao;
	
	@Autowired
	public UserManager(UserDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	@Override
	public DataResult<List<User>> getall() {
		return new SuccessDataResult<List<User>>(this.usersDao.findAll(), "İstifadəçilər siyahılandı");
	}

	@Override
	public Result register(User users) {
		this.usersDao.save(users);
		return new SuccessResult("Yeni istifadəçi qeydiyyatdan keçdi");
	}

}
