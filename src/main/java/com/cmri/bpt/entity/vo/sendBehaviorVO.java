package com.cmri.bpt.entity.vo;

import java.util.List;

public class sendBehaviorVO {
	private int index;
	private List<actionVO> behavior;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public List<actionVO> getBehavior() {
		return behavior;
	}
	public void setBehavior(List<actionVO> behavior) {
		this.behavior = behavior;
	}
	
}
