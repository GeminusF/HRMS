package javacamp.hrms.dataAccess.abstracts;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.CandidatesCVUniversity;

@Repository
public interface CandidatesCVUniversityDao extends JpaRepository<CandidatesCVUniversity, Integer> {

	List<CandidatesCVUniversity> findByGraduationYearOrderByIdAsc(Date date);
}
