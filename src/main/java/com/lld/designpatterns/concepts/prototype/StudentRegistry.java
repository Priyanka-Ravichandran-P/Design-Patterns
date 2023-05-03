package com.lld.designpatterns.concepts.prototype;

import java.util.HashMap;
import java.util.Map;



public class StudentRegistry {
	
	Map<String, Student> registry = new HashMap<>();
	
	public void fillRegistry(Student student) {
		registry.put(student.getBatchName(), student);
	}
	
	public Student getStudentTemplate(String batchName) {
		return registry.get(batchName);
	}

}
