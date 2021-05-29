package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.JobVacancy;

@Repository
public interface JobVacancyDao extends JpaRepository<JobVacancy, Integer> {

	List<JobVacancy> findByIsActiveTrue();

	List<JobVacancy> findByIsActiveFalse();
	
	List<JobVacancy> findByIsActiveTrueOrderByReleaseDateAsc();
	
	
}
