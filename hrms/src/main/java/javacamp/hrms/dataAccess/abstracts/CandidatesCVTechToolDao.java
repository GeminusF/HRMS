package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.CandidatesCVTechTool;

@Repository
public interface CandidatesCVTechToolDao extends JpaRepository<CandidatesCVTechTool, Integer> {

}
