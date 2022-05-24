package com.joe.TaskManager;

public class TaskProperties {

//	Properties
	private String name;
	private boolean isComplete;

//	Overload Constructor 
//	public TaskProperties(String name, boolean isComplete) {
//		super();
//		this.name = name;
//		this.isComplete = isComplete;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public TaskProperties() {
	}

//	Overload Constructor 
	public TaskProperties(String name) {
		this.name = name;
//		this.isComplete = isComplete;
	}
	
	@Override
	public String toString() {
		return this.name + (this.isComplete ? " (COMPLETE)" : "");
	}

}
