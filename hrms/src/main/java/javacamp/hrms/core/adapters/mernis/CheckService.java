package javacamp.hrms.core.adapters.mernis;

import javacamp.hrms.entities.concretes.Candidates;

public interface CheckService {
	
	boolean checkIfRealTcNo(Candidates candidates);
	
}
