package com.kita.first.level2.practice2;

public class Practice03 {
	
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Practice03(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	int getAge()
	{
		return age;
	}
	
	public static void main(String[] args)
	{
		Practice03 myP = new Practice03("김땡떙", 20);
		myP.setName("김냥냥");
		
		String myName = myP.getName();
		int myAge = myP.getAge();
		// 이름, 나이 출력
		System.out.printf("%s, %d", myName, myAge);
	}
}
