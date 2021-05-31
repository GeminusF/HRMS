package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.JobVacancyService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.JobVacancyDao;
import javacamp.hrms.entities.concretes.JobVacancy;

@Service
public class JobVacancyManager implements JobVacancyService {

	private JobVacancyDao jobVacancyDao;

	@Autowired
	public JobVacancyManager(JobVacancyDao jobVacancyDao) {
		super();
		this.jobVacancyDao = jobVacancyDao;
	}

	@Override
	public DataResult<List<JobVacancy>> getall() {
		return new SuccessDataResult<List<JobVacancy>>(this.jobVacancyDao.findAll(), "Vakansiyalar siyahılandı");
	}

	@Override
	public Result add(JobVacancy jobVacancy) {
		this.jobVacancyDao.save(jobVacancy);
		return new SuccessResult("Yeni vakansiya əlavə olundu");
	}

	@Override
	public DataResult<List<JobVacancy>> findByIsActiveTrue() {
		return new SuccessDataResult<List<JobVacancy>>(this.jobVacancyDao.findByIsActiveTrue(),
				"Aktiv vakansiyalar siyahılandı");
	}

	@Override
	public DataResult<List<JobVacancy>> findByIsActiveFalse() {
		return new SuccessDataResult<List<JobVacancy>>(this.jobVacancyDao.findByIsActiveFalse(),
				"Pasiv vakansiyalar siyahılandı");
	}

	@Override
	public DataResult<List<JobVacancy>> findByIsActiveTrueOrderByReleaseDateAsc() {
		return new SuccessDataResult<List<JobVacancy>>(this.jobVacancyDao.findByIsActiveTrueOrderByReleaseDateAsc(),
				"Aktiv vakansiyalar artan yayım tarixinə görə siyahılandı");
	}

	@Override
	public DataResult<List<JobVacancy>> findByIsActiveTrueOrderByCompanyName() {
		return new SuccessDataResult<List<JobVacancy>>(this.jobVacancyDao.findByIsActiveTrueOrderByCompanyName(), "Aktiv vakansiyalar korporativ adına görə sıralandı");
	}

	@Override
	public void setIsActiveFalse() {
		this.jobVacancyDao.setIsActiveFalse();
	}


}
