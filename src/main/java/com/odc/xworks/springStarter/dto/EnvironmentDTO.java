package com.odc.xworks.springStarter.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.odc.xworks.springStarter.SpringStarterApplication;

@Entity
public class EnvironmentDTO {

	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lEnvId;
	private String sEnvName;
	private String sLocationId;
	private Boolean bIsActive;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "lAppId", nullable = false)
	    private ApplicationDTO app;
	
	public EnvironmentDTO(Long lEnvId, Long lAppId, String sEnvName, String sLocationId, Boolean bIsActive) {
		super();
		this.lEnvId = lEnvId;
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
		return "Environment [lEnvId=" + lEnvId + ", sEnvName=" + sEnvName + ", sLocationId="
				+ sLocationId + ", bIsActive=" + bIsActive + "]";
	}
	
	
	
}
