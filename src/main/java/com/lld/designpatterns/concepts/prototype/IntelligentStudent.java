package com.lld.designpatterns.concepts.prototype;

public class IntelligentStudent extends Student {
	private int iq;
	
	public IntelligentStudent() {
		
	}
	
	public IntelligentStudent(IntelligentStudent student) {
		super(student);
		this.iq = student.iq;
	}

	public IntelligentStudent clone() {
		return new IntelligentStudent(this);
	}

	public int getIq() {
		return iq;
	}

	

	@Override
	public String toString() {
		return "IntelligentStudent [iq=" + iq + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getAvgBatchPSP()=" + getAvgBatchPSP() + ", getBatchName()=" + getBatchName()
				+ ", getYearOfEnrollment()=" + getYearOfEnrollment() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
}
