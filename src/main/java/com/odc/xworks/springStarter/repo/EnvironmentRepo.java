package com.odc.xworks.springStarter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odc.xworks.springStarter.dto.EnvironmentDTO;

public interface EnvironmentRepo extends JpaRepository<EnvironmentDTO, Long>{
	
}
