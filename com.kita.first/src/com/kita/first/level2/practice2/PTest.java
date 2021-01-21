package com.kita.first.level2.practice2;

public class PTest {
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
