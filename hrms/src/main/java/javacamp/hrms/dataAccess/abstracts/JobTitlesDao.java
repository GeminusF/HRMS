package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.JobTitles;

@Repository
public interface JobTitlesDao extends JpaRepository<JobTitles, Integer> {

}
