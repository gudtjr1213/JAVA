package com.kita.first.level2;

public class PhoneTest {
	public static void main(String[] args)
	{
		GalaxyPhone sNote20 = new GalaxyPhone("s노트20","파란색",300,"갤럭시");
		System.out.println(sNote20.ai_secr);
		sNote20.sendMsg("안녕");
		System.out.println("회사 : "+sNote20.company);
//		Phone myPhone = new Phone("d","갤럭시 S21", "노란색", 300);
//		Phone yourPhone = new Phone("d","갤럭시 노트20", "빨간색", 250);
//		System.out.println(myPhone.name);
//		System.out.println(yourPhone.name);      
	}
}
