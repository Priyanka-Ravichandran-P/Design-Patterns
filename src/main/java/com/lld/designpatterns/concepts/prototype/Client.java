package com.lld.designpatterns.concepts.prototype;

public class Client {

	public static void main(String[] args) {
		StudentRegistry registry = new StudentRegistry();
		fillUpRegistry(registry);
		Student aprilObj = registry.getStudentTemplate("April Batch").clone();
		Student juneObj = registry.getStudentTemplate("June Batch").clone();
		Student mayObj = registry.getStudentTemplate("May Batch").clone();
		
		System.out.println(aprilObj);
		System.out.println("=======================");
		System.out.println(mayObj);
		System.out.println("=======================");
		System.out.println(juneObj);
		System.out.println("=======================");
		
		
	}
	
	public static void fillUpRegistry(StudentRegistry registry) {
		
		
		Student aprilBatchStudent = new Student();
		aprilBatchStudent.setAvgBatchPSP(90);
		aprilBatchStudent.setBatchName("April Batch");
		aprilBatchStudent.setYearOfEnrollment(2023);
		registry.fillRegistry(aprilBatchStudent);
		
		Student mayBatchStudent = new Student();
		mayBatchStudent.setAvgBatchPSP(85);
		mayBatchStudent.setBatchName("May Batch");
		mayBatchStudent.setYearOfEnrollment(2022);
		registry.fillRegistry(mayBatchStudent);
		
		Student juneBatchStudent = new Student();
		juneBatchStudent.setAvgBatchPSP(80);
		juneBatchStudent.setBatchName("June Batch");
		juneBatchStudent.setYearOfEnrollment(2022);
		registry.fillRegistry(juneBatchStudent);
		
		IntelligentStudent intelligentStudent = new IntelligentStudent();
		intelligentStudent.setAvgBatchPSP(98);
		intelligentStudent.setBatchName("July Batch");
		intelligentStudent.setYearOfEnrollment(2023);
		intelligentStudent.setIq(98);
		
		System.out.println(intelligentStudent.clone()); // Just Prototype not Registry
		System.out.println("=======================");
		
	}
	
}
