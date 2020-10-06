package com.odc.xworks.springStarter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odc.xworks.springStarter.entity.MessageDTO;

public interface MessageRepo extends JpaRepository<MessageDTO, Long>{
	
}
