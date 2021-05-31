package javacamp.hrms.dataAccess.abstracts;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.JobVacancy;

@Repository
public interface JobVacancyDao extends JpaRepository<JobVacancy, Integer> {

	List<JobVacancy> findByIsActiveTrue();

	List<JobVacancy> findByIsActiveFalse();

	List<JobVacancy> findByIsActiveTrueOrderByReleaseDateAsc();

	List<JobVacancy> findByIsActiveTrueOrderByCompanyName();

	@Modifying
	@Transactional
	@Query(value = "UPDATE JobVacancy isActive SET isActive = false WHERE isActive = true ", nativeQuery = true)
	public void setIsActiveFalse();

}
