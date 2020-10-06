package com.odc.xworks.springStarter.dto;

import javax.persistence.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.odc.xworks.springStarter.SpringStarterApplication;

@Entity
public class MessageDTO {
	
	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lId;
	private String sName;
	private String sMessage;
	
		public MessageDTO(String sName, String sMessage) {
		super();
		this.sName = sName;
		this.sMessage = sMessage;
		log.info(" --- inserted " + this.toString() + "successfully --- ");
	}
		
	protected MessageDTO() {}	
	
	public Long getlId() {
		return lId;
	}
	
	public void setlId(Long lId) {
		this.lId = lId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsMessage() {
		return sMessage;
	}
	public void setsMessage(String sMessage) {
		this.sMessage = sMessage;
	}
	
	@Override
	public String toString() {
		return "Message [lId=" + lId + ", sName=" + sName + ", sMessage=" + sMessage + "]";
	}
	
	
	
}
