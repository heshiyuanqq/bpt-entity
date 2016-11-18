package com.cmri.bpt.entity.vo;

import java.io.Serializable;

public class behaviorVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private actionVO action;
	private String grouptag;
	private int ratio;
	private float floatratio;

	public actionVO getAction() {
		return action;
	}

	public void setAction(actionVO action) {
		this.action = action;
	}

	public String getGrouptag() {
		return grouptag;
	}

	public void setGrouptag(String grouptag) {
		this.grouptag = grouptag;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
		this.floatratio = ratio;
	}
	
	public float getFloatRatio(){
		return floatratio;
	}
}
