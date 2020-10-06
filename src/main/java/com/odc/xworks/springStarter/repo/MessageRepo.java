package com.odc.xworks.springStarter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odc.xworks.springStarter.dto.MessageDTO;

public interface MessageRepo extends JpaRepository<MessageDTO, Long>{
	
}
