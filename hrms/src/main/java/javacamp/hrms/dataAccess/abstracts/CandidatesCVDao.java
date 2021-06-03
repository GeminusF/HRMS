package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.CandidatesCV;

@Repository
public interface CandidatesCVDao extends JpaRepository<CandidatesCV, Integer> {

}
