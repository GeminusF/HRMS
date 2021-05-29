package javacamp.hrms.core.adapters.mernis;

import javacamp.hrms.entities.concretes.Candidate;

public interface CheckService {
	
	boolean checkIfRealTcNo(Candidate candidates);
	
}
