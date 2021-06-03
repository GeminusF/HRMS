package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.CandidatesCVJobExperience;

@Repository
public interface CandidatesCVJobExperienceDao extends JpaRepository<CandidatesCVJobExperience, Integer> {

}
