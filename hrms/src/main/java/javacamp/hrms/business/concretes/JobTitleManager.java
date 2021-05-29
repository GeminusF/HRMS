package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.JobTitleService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.JobTitleDao;
import javacamp.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitlesDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitlesDao.findAll(), "İş pozisiyaları siyahılandı");
	}

	@Override
	public Result add(JobTitle jobTitles) {
		this.jobTitlesDao.save(jobTitles);
		return new SuccessResult("Yeni iş pozisiyası əlavə olundu");
	}

}
