package com.kita.first.level3;

public class Dog extends Animal{
	@Override
	public void crying() {
		System.out.println("개가 멍멍 운다.");
	}
	
	public void barking() {
		System.out.println("개가 짖는다.");
	}
}
