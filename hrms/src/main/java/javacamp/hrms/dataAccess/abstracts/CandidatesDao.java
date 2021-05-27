package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.Candidates;

@Repository
public interface CandidatesDao extends JpaRepository<Candidates, Integer>{
	
}
