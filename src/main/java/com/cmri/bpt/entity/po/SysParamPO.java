package com.cmri.bpt.entity.po;

import java.io.Serializable;

public class SysParamPO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer userId;
	private String ftpIp;
	private String ntpIp;
	private Integer duration;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getFtpIp() {
		return ftpIp;
	}



	public void setFtpIp(String ftpIp) {
		this.ftpIp = ftpIp;
	}



	public String getNtpIp() {
		return ntpIp;
	}



	public void setNtpIp(String ntpIp) {
		this.ntpIp = ntpIp;
	}



	public Integer getDuration() {
		return duration;
	}



	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	

	@Override
	public String toString() {
		return "SysParamPO [id=" + id + ", userId=" + userId + ", ftpIp="
				+ ftpIp + ", ntpIp=" + ntpIp + ", duration=" + duration + "]";
	}

}
