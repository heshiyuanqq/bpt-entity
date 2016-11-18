package com.cmri.bpt.entity.auth;

import java.util.Date;

import com.cmri.bpt.common.json.JsonDateTimeDeserializer;
import com.cmri.bpt.common.json.JsonDateTimeSerializer;
import com.cmri.bpt.common.token.TokenSession;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class AppTokenSession implements TokenSession {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3238808329678739018L;

	private Integer id;

	private Integer appId;

	private Integer userId;

	private Integer sysId;

	// 分组信息
	private String tag;
	
	private String box;

	private String token;

	private String lastIp;

	private Double lastLng;

	private Double lastLat;

	private String lastAddress;

	private String xppId;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	private Date lastAccessTime = new Date();

	private Boolean online;

	private String phoneType;

	private String phoneNumber;

	@Override
	public Integer getAppId() {
		return appId;
	}

	@Override
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	@Override
	public Integer getUserId() {
		return userId;
	}

	@Override
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String getToken() {
		return token;
	}

	@Override
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String getLastIp() {
		return lastIp;
	}

	@Override
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	@Override
	public Double getLastLng() {
		return lastLng;
	}

	@Override
	public void setLastLng(Double lastLng) {
		this.lastLng = lastLng;
	}

	@Override
	public Double getLastLat() {
		return lastLat;
	}

	@Override
	public void setLastLat(Double lastLat) {
		this.lastLat = lastLat;
	}

	@Override
	public String getLastAddress() {
		return lastAddress;
	}

	@Override
	public void setLastAddress(String lastAddress) {
		this.lastAddress = lastAddress;
	}

	@Override
	public Date getLastAccessTime() {
		return lastAccessTime;
	}

	@Override
	public void setLastAccessTime(Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	// public void fromDefaultTokenSession(DefaultTokenSession
	// defaultTokenSession) {
	// if (defaultTokenSession != null) {
	// this.setAppId(defaultTokenSession.getAppId());
	// this.setUserId(defaultTokenSession.getUserId());
	// this.setSysId(defaultTokenSession.getSysId());
	// this.setToken(defaultTokenSession.getToken());
	// this.setLastIp(defaultTokenSession.getLastIp());
	// this.setLastLat(defaultTokenSession.getLastLat());
	// this.setLastLng(defaultTokenSession.getLastLng());
	// this.setLastAddress(defaultTokenSession.getLastAddress());
	// this.setLastAccessTime(defaultTokenSession.getLastAccessTime());
	// }
	// }

	@Override
	public Integer getSysId() {
		return sysId;
	}

	@Override
	public void setSysId(Integer sysId) {
		this.sysId = sysId;
	}

	@Override
	public String getXppId() {

		return xppId;
	}

	@Override
	public void setXppId(String xppId) {

		this.xppId = xppId;

	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public Boolean isOnline() {
		return online;
	}

	@Override
	public void setOnline(Boolean online) {
		this.online = online;
	}

	@Override
	public String getPhoneType() {

		return phoneType;
	}

	@Override
	public void setPhoneType(String phoneType) {

		this.phoneType = phoneType;

	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;

	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}
}
