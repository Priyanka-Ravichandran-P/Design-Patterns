package com.lld.designpatterns.concepts.builder;

public class Student {
	private String name;
	private int id;
	private int age;
	private int psp;
	private long phoneNumber;


	private Student(Builder b) {
		this.age = b.age;
		this.id = b.id;
		this.name = b.name;
		this.phoneNumber = b.phoneNumber;
		this.psp = b.psp;
	}


	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", psp=" + psp + ", phoneNumber=" + phoneNumber + "]";
	}

	static class Builder {
		private String name;
		private int id;
		private int age;
		private int psp;
		private long phoneNumber;

		private Builder() {}

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setPsp(int psp) {
			this.psp = psp;
			return this;
		}

		public Builder setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Student build() throws Exception {
			if(this.age >30) throw new Exception("Invalid Age");
			if(this.psp <10) throw new Exception("Invalid PSP");
			Student s = new Student(this);
			return s;
		}

	}

}
