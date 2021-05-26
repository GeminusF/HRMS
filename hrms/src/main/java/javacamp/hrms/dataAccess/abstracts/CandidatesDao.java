package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer>{
	
}
