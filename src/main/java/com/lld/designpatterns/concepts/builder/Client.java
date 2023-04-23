package com.lld.designpatterns.concepts.builder;

import com.lld.designpatterns.concepts.builder.Student.Builder;

public class Client {
/**
 *  Requirement:
 *  Student Object should not get create before validation,
 *  After the validation check passed then only student object should get created
 */
	public static void main(String[] args) throws Exception{
		try {
			Builder builder = Student.builder();
			Student student = builder.setAge(25)
						.setId(2)
							.setName("Priyanka")
								.setPhoneNumber(963258741)
									.setPsp(95).build();
			
			System.out.print("STUDENT :: " + student.toString());
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
			
		}
		

	}
}
