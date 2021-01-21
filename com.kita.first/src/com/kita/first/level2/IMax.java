package com.kita.first.level2;

public class IMax {
	private int memory;
	private String color;
	
	public IMax(int memory, String color)
	{
		this.memory =memory;
		this.color = color;
	}
	void setMemory(int memory)
	{
		this.memory = memory;
	}
	
	int getMemory()
	{
		return memory;
	}
	
	void setColor(String color)
	{
		this.color = color;
	}
	
	String getColor()
	{
		return color;
	}
	
}
