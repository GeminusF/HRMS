package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.CandidatesCVForeignLanguage;

@Repository
public interface CandidatesCVForeignLanguageDao  extends JpaRepository<CandidatesCVForeignLanguage, Integer> {

}
