package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.entities.concretes.Users;


public interface UsersService {
	
	DataResult<List<Users>> getall();
	
	Result register(Users users);
}
