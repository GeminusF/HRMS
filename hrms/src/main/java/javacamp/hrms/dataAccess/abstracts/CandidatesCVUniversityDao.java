package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.CandidatesCVUniversity;

@Repository
public interface CandidatesCVUniversityDao extends JpaRepository<CandidatesCVUniversity, Integer> {

}
