package com.kita.first;

public class printf {
	public static void main(String[] args) {
		//System.out.printf();
		
		int num = 10;
		String name = "김땡땡";
		
		// 김땡떙은 10살이다.
		//System.out.println(name + "은 " + num + "살이다.");
		//System.out.printf("%s은 %d살이다.", name, num);
		 		
		/*
		 * 올해로 20살이 된 김땡땡은
		 * 알바로 시작하여 매달 123만원을 받게 되었다.
		 * 김땡땡은 월급의 50%인 615000원을 떼어
		 * A 저축은행의 연 이자율 2.33%짜리 적금에 넣기로 결심햇다.
		 */
		int age = 20; 
		name = "김떙땡";
		int salary = 1_230_000;
		int precent = 50;
		int saving = 615_000;
		char bank = 'A';
		double rateOfInterest = 2.33333333333;
		System.out.printf("올해로 %d살이 된 %s은\n알바로 시작하여 매달 %d원을 받게 되었다.\n", age, name, salary);
		System.out.printf("%s은 월급의 %d%%인 %d원을 떼어\n%c 저축은행의 연 이자율 %.2f%%짜리 적금을 넣기로 결심했다.",name,precent,saving,bank,rateOfInterest);
		
	}
}
