package com.cmri.bpt.entity.testcase;

public class TestcaseLog {

	public enum TestcaseStatus {

		running("执行中"), stopped("已中止"), //
		finished("已完成");

		//

		private String text;

		private TestcaseStatus(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	private Integer id;

	private Integer appSessionId;

	private String testcase;
	
	private String action;

	private TestcaseStatus status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAppSessionId() {
		return appSessionId;
	}

	public void setAppSessionId(Integer appSessionId) {
		this.appSessionId = appSessionId;
	}

	public String getTestcase() {
		return testcase;
	}

	public void setTestcase(String testcase) {
		this.testcase = testcase;
	}

	public TestcaseStatus getStatus() {
		return status;
	}

	public void setStatus(TestcaseStatus status) {
		this.status = status;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	

}
