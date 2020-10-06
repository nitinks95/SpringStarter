package com.odc.xworks.springStarter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.odc.xworks.springStarter.entity.Message;
import com.odc.xworks.springStarter.dto.MessageDTO;

@Mapper
public interface MessageMapper {
	
	MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);
	
	MessageDTO MsgToMsgDTO(Message msg);
	
}
