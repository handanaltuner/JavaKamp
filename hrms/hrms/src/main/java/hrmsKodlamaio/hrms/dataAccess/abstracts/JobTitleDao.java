package hrmsKodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrmsKodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository <JobTitle, Integer>{
	
	
}
