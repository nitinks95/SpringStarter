package com.odc.xworks.springStarter.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.odc.xworks.springStarter.SpringStarterApplication;

public class Environment {

	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	

	private Long lEnvId;
	private Long lAppId;
	private String sEnvName;
	private String sLocationId;
	private Boolean bIsActive;
	
	public Environment(Long lEnvId, Long lAppId, String sEnvName, String sLocationId, Boolean bIsActive) {
		super();
		this.lEnvId = lEnvId;
		this.lAppId = lAppId;
		this.sEnvName = sEnvName;
		this.sLocationId = sLocationId;
		this.bIsActive = bIsActive;
		log.info(" --- inserted Environment " + this.toString() + "successfully --- ");
	}
	
	public Long getlEnvId() {
		return lEnvId;
	}
	public void setlEnvId(Long lEnvId) {
		this.lEnvId = lEnvId;
	}
	public Long getlAppId() {
		return lAppId;
	}
	public void setlAppId(Long lAppId) {
		this.lAppId = lAppId;
	}
	public String getsEnvName() {
		return sEnvName;
	}
	public void setsEnvName(String sEnvName) {
		this.sEnvName = sEnvName;
	}
	public String getsLocationId() {
		return sLocationId;
	}
	public void setsLocationId(String sLocationId) {
		this.sLocationId = sLocationId;
	}
	public Boolean getbIsActive() {
		return bIsActive;
	}
	public void setbIsActive(Boolean bIsActive) {
		this.bIsActive = bIsActive;
	}
	@Override
	public String toString() {
		return "Environment [lEnvId=" + lEnvId + ", lAppId=" + lAppId + ", sEnvName=" + sEnvName + ", sLocationId="
				+ sLocationId + ", bIsActive=" + bIsActive + "]";
	}
	
	
	
}
