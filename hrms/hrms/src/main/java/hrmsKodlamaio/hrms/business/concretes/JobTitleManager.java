package hrmsKodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsKodlamaio.hrms.business.abstracts.JobTitleService;
import hrmsKodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import hrmsKodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager  implements JobTitleService{

	private JobTitleDao jobTitleDao;
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

		
		

}