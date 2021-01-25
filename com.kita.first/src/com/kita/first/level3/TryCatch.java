package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args)
	{
		String str = "123";
		int n = Integer.parseInt(str);
		double num2 = Double.parseDouble(str);
		
		double n1 = 3.4;
		int n2 = (int)n1;
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		
		Animal ani = new Animal();
		Cat cat = new Cat();
		ani = cat;
		
		try 
		{
			Dog dog = (Dog)ani;
		}catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("에러 발생");
		}finally // 옵션 (정상적 실행이든, 에러든 finally는 무조건 실행)
		{
			System.out.println("형변환 시도 종료");
		}
	}
}
