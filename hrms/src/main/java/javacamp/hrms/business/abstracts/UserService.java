package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.User;


public interface UserService {
	
	DataResult<List<User>> getall();
	
	Result register(User users);
}
