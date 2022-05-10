package jp.co.aforce.test;

public class Employee {

	private int number;
	private String name;
	private String sex;
	private int age;

	Employee(int number, String name, String sex, int age) {
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

}
