package com.test1;

public class MicroFinanceSteps {
	private long stepId;
	private long financeCode;
	private String basicSteps;
	private String curentStep;
	private String stepCompleted;
	private String nextAction;
	private String nextActionGroup;
	private String entityState;

	public MicroFinanceSteps() {

	}

	public MicroFinanceSteps(long stepId, long financeCode, String basicSteps, String curentStep, String stepCompleted,
			String nextAction, String nextActionGroup, String entityState) {
		super();
		this.stepId = stepId;
		this.financeCode = financeCode;
		this.basicSteps = basicSteps;
		this.curentStep = curentStep;
		this.stepCompleted = stepCompleted;
		this.nextAction = nextAction;
		this.nextActionGroup = nextActionGroup;
		this.entityState = entityState;
	}

	public long getStepId() {
		return stepId;
	}

	public void setStepId(long stepId) {
		this.stepId = stepId;
	}

	public long getFinanceCode() {
		return financeCode;
	}

	public void setFinanceCode(long financeCode) {
		this.financeCode = financeCode;
	}

	public String getBasicSteps() {
		return basicSteps;
	}

	public void setBasicSteps(String basicSteps) {
		this.basicSteps = basicSteps;
	}

	public String getCurentStep() {
		return curentStep;
	}

	public void setCurentStep(String curentStep) {
		this.curentStep = curentStep;
	}

	public String getStepCompleted() {
		return stepCompleted;
	}

	public void setStepCompleted(String stepCompleted) {
		this.stepCompleted = stepCompleted;
	}

	public String getNextAction() {
		return nextAction;
	}

	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

	public String getNextActionGroup() {
		return nextActionGroup;
	}

	public void setNextActionGroup(String nextActionGroup) {
		this.nextActionGroup = nextActionGroup;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
