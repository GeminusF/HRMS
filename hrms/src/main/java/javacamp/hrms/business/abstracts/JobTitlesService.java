package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.entities.concretes.JobTitles;

public interface JobTitlesService {
	List<JobTitles> getAll();
}
