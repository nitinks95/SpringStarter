package com.odc.xworks.springStarter;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.odc.xworks.springStarter.entity.Message;

public interface MessageRepo extends CrudRepository<Message, Long>{
	
	List<Message> findBysName(String sName);
	Message findBylId(long lId);
}
