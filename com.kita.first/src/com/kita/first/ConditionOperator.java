package com.kita.first;

public class ConditionOperator {
	public static void main(String [] args) {
		// 조건연산자(삼항연산자) A ? B : c;
		int n1 = 3;
		int n2 = 2;
		
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		System.out.println(isOdd);
		
		String result = (n1 > n2) ? "맞음" : "아님";
		System.out.println(result);
		
	}
}
