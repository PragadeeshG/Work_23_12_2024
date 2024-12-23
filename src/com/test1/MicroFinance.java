package com.test1;

public class MicroFinance {
	private long id;
	private String individualIncomeType;
	private String accessToFinanceServices;
	private String conventionalLenders;
	private String unbanked;
	private String ethicalLending;
	private String financingOps;
	private Integer numberOfAccounts;
	private String entityState;

	public MicroFinance() {

	}

	public MicroFinance(long id, String individualIncomeType, String accessToFinanceServices,
			String conventionalLenders, String unbanked, String ethicalLending, String financingOps,
			Integer numberOfAccounts, String entityState) {
		super();
		this.id = id;
		this.individualIncomeType = individualIncomeType;
		this.accessToFinanceServices = accessToFinanceServices;
		this.conventionalLenders = conventionalLenders;
		this.unbanked = unbanked;
		this.ethicalLending = ethicalLending;
		this.financingOps = financingOps;
		this.numberOfAccounts = numberOfAccounts;
		this.entityState = entityState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIndividualIncomeType() {
		return individualIncomeType;
	}

	public void setIndividualIncomeType(String individualIncomeType) {
		this.individualIncomeType = individualIncomeType;
	}

	public String getAccessToFinanceServices() {
		return accessToFinanceServices;
	}

	public void setAccessToFinanceServices(String accessToFinanceServices) {
		this.accessToFinanceServices = accessToFinanceServices;
	}

	public String getConventionalLenders() {
		return conventionalLenders;
	}

	public void setConventionalLenders(String conventionalLenders) {
		this.conventionalLenders = conventionalLenders;
	}

	public String getUnbanked() {
		return unbanked;
	}

	public void setUnbanked(String unbanked) {
		this.unbanked = unbanked;
	}

	public String getEthicalLending() {
		return ethicalLending;
	}

	public void setEthicalLending(String ethicalLending) {
		this.ethicalLending = ethicalLending;
	}

	public String getFinancingOps() {
		return financingOps;
	}

	public void setFinancingOps(String financingOps) {
		this.financingOps = financingOps;
	}

	public Integer getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void setNumberOfAccounts(Integer numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
