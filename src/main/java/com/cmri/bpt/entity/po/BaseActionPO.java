package com.cmri.bpt.entity.po;

import java.io.Serializable;

public class BaseActionPO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int actionid;
	private String actionname;
	private String businessname;
	private String businesssonname;

	public int getActionid() {
		return actionid;
	}

	public void setActionid(int actionid) {
		this.actionid = actionid;
	}

	public String getActionname() {
		return actionname;
	}

	public void setActionname(String actionname) {
		this.actionname = actionname;
	}

	public String getBusinessname() {
		return businessname;
	}

	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}

	public String getBusinesssonname() {
		return businesssonname;
	}

	public void setBusinesssonname(String businesssonname) {
		this.businesssonname = businesssonname;
	}

}
