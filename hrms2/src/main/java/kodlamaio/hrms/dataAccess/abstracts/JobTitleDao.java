package dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository <JobTitle, Integer>{
	
	
}
