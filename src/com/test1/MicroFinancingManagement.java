package com.test1;

public class MicroFinancingManagement {
	private long microFinancingCode;
	private String microLoans;
	private long samllLendiKng;
	private long refernceCode;
	private String KeyTakeaways;
	private String popularStates;
	private String entityState;

	public MicroFinancingManagement() {

	}

	public MicroFinancingManagement(long microFinancingCode, String microLoans, long samllLendiKng, long refernceCode,
			String keyTakeaways, String popularStates, String entityState) {
		super();
		this.microFinancingCode = microFinancingCode;
		this.microLoans = microLoans;
		this.samllLendiKng = samllLendiKng;
		this.refernceCode = refernceCode;
		KeyTakeaways = keyTakeaways;
		this.popularStates = popularStates;
		this.entityState = entityState;
	}

	public long getMicroFinancingCode() {
		return microFinancingCode;
	}

	public void setMicroFinancingCode(long microFinancingCode) {
		this.microFinancingCode = microFinancingCode;
	}

	public String getMicroLoans() {
		return microLoans;
	}

	public void setMicroLoans(String microLoans) {
		this.microLoans = microLoans;
	}

	public long getSamllLendiKng() {
		return samllLendiKng;
	}

	public void setSamllLendiKng(long samllLendiKng) {
		this.samllLendiKng = samllLendiKng;
	}

	public long getRefernceCode() {
		return refernceCode;
	}

	public void setRefernceCode(long refernceCode) {
		this.refernceCode = refernceCode;
	}

	public String getKeyTakeaways() {
		return KeyTakeaways;
	}

	public void setKeyTakeaways(String keyTakeaways) {
		KeyTakeaways = keyTakeaways;
	}

	public String getPopularStates() {
		return popularStates;
	}

	public void setPopularStates(String popularStates) {
		this.popularStates = popularStates;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
