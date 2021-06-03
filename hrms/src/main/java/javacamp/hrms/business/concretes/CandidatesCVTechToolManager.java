package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesCVTechToolService;
import javacamp.hrms.core.utilities.result.DataResult;
import javacamp.hrms.core.utilities.result.Result;
import javacamp.hrms.core.utilities.result.SuccessDataResult;
import javacamp.hrms.core.utilities.result.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesCVTechToolDao;
import javacamp.hrms.entities.concretes.CandidatesCVTechTool;

@Service
public class CandidatesCVTechToolManager  implements CandidatesCVTechToolService{

	private CandidatesCVTechToolDao cvTechToolDao; 
	
	@Autowired
	public CandidatesCVTechToolManager(CandidatesCVTechToolDao cvTechToolDao) {
		super();
		this.cvTechToolDao = cvTechToolDao;
	}

	@Override
	public DataResult<List<CandidatesCVTechTool>> getall() {
		return new SuccessDataResult<List<CandidatesCVTechTool>>(this.cvTechToolDao.findAll(), "Namizədlərin CV texnologiya vasitələri siyahılandı");
	}

	@Override
	public Result add(CandidatesCVTechTool cvTechTool) {
		this.cvTechToolDao.save(cvTechTool);
		return new SuccessResult("Yeni CV texnologiya vasitəsi əlavə olundu");
	}

}
