package com.kita.first.level2.pack1;

public class FinalStatic {
	int N1;
	static final int N2 = 4;
	int n3 = 1;
	
	FinalStatic(int n1)
	{
		this.N1 = n1;
		printNum(n1);
	}
	
	static void printNum(int input)
	{
		System.out.println(input);
//		System.out.println(n3);
//		call();
	}
	
	void call()
	{
		System.out.println("안녕");
	}
	
}
// final이 붙으면 override 불가능
// class에 final이 붙으면 상속 불가능