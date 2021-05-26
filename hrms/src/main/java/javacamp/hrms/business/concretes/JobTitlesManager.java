package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.JobTitlesService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.JobTitlesDao;
import javacamp.hrms.entities.concretes.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService {
	
	private JobTitlesDao jobTitlesDao;
	
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}
	
	@Override
	public DataResult<List<JobTitles>> getAll() {
		return new SuccessDataResult<List<JobTitles>>(this.jobTitlesDao.findAll(), "İş pozisiyaları siyahılandı");
	}

	@Override
	public Result add(JobTitles jobTitles) {
		this.jobTitlesDao.save(jobTitles);
		return new SuccessResult("Yeni iş pozisiyası əlavə olundu");
	}

}
