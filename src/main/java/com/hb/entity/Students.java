package com.hb.entity;

public class Students {
	public Students(){
		
	}
	
	public Students(int studentsId, String studentsName, int age, String address) {
		super();
		this.studentsId = studentsId;
		this.studentsName = studentsName;
		this.age = age;
		this.address = address;
	}

	public int studentsId;
	public String studentsName;
	public int age;
	public String address;
	public int getStudentsId() {
		return studentsId;
	}
	public void setStudentsId(int studentsId) {
		this.studentsId = studentsId;
	}
	public String getStudentsName() {
		return studentsName;
	}
	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
