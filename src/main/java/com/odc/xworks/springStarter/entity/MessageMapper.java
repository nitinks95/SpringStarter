package com.odc.xworks.springStarter.entity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MessageMapper {
	
	MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);
	
	MessageDTO MsgToMsgDTO(Message msg);
	
}
