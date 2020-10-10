package com.odc.xworks.springStarter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odc.xworks.springStarter.dto.ApplicationDTO;

public interface ApplicationRepo extends JpaRepository<ApplicationDTO, Long>{
	
}
