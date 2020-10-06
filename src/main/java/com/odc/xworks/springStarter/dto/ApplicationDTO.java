package com.odc.xworks.springStarter.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.odc.xworks.springStarter.SpringStarterApplication;

@Entity
public class ApplicationDTO {
	
	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lAppId;
	private String sAppName;
	private String sVersion;
	private String sLastRelease;
	private String sNextRelease;
	private String sDevDate;
	private String sIsDecommisioned;
	private String sTLName;
	private String sTeamMail;
	
	@OneToMany(mappedBy = "application", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<EnvironmentDTO> envList;
	
	public ApplicationDTO(Long lAppId, String sAppName, String sVersion, String sLastRelease, String sNextRelease,
			String sDevDate, String sIsDecommisioned, String sTLName, String sTeamMail) {
		super();
		this.lAppId = lAppId;
		this.sAppName = sAppName;
		this.sVersion = sVersion;
		this.sLastRelease = sLastRelease;
		this.sNextRelease = sNextRelease;
		this.sDevDate = sDevDate;
		this.sIsDecommisioned = sIsDecommisioned;
		this.sTLName = sTLName;
		this.sTeamMail = sTeamMail;
		log.info(" --- inserted Application " + this.toString() + "successfully --- ");
	}
	
	public Long getlAppId() {
		return lAppId;
	}
	public void setlAppId(Long lAppId) {
		this.lAppId = lAppId;
	}
	public String getsAppName() {
		return sAppName;
	}
	public void setsAppName(String sAppName) {
		this.sAppName = sAppName;
	}
	public String getsVersion() {
		return sVersion;
	}
	public void setsVersion(String sVersion) {
		this.sVersion = sVersion;
	}
	public String getsLastRelease() {
		return sLastRelease;
	}
	public void setsLastRelease(String sLastRelease) {
		this.sLastRelease = sLastRelease;
	}
	public String getsNextRelease() {
		return sNextRelease;
	}
	public void setsNextRelease(String sNextRelease) {
		this.sNextRelease = sNextRelease;
	}
	public String getsDevDate() {
		return sDevDate;
	}
	public void setsDevDate(String sDevDate) {
		this.sDevDate = sDevDate;
	}
	public String getsIsDecommisioned() {
		return sIsDecommisioned;
	}
	public void setsIsDecommisioned(String sIsDecommisioned) {
		this.sIsDecommisioned = sIsDecommisioned;
	}
	public String getsTLName() {
		return sTLName;
	}

	public void setsTLName(String sTLName) {
		this.sTLName = sTLName;
	}

	public String getsTeamMail() {
		return sTeamMail;
	}

	public void setsTeamMail(String sTeamMail) {
		this.sTeamMail = sTeamMail;
	}
	
	@Override
	public String toString() {
		return "ApplicationDTO [lAppId=" + lAppId + ", sAppName=" + sAppName + ", sVersion=" + sVersion
				+ ", sLastRelease=" + sLastRelease + ", sNextRelease=" + sNextRelease + ", sDevDate="
				+ sDevDate + ", sIsDecommisioned=" + sIsDecommisioned
				+ ", sTLName=" + sTLName + ", sTeamMail=" + sTeamMail + "]";
	}
	
	
	
}
