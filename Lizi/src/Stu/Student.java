package com.qf.cdjava2201.day15.stumgr;

public class Student {
	//学号，姓名，年龄，密码，手机号
	String no;
	String name;
	int age;
	String password;
	String phone;
	
	
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", password=" + password + ", phone=" + phone
				+ "]";
	}

	public Student() {}
	
	public Student(String no, String name, int age, String password, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.password = password;
		this.phone = phone;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
