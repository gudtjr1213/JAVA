package com.kita.first.level2.pack1;

public class Singleton {
	static Singleton sg = null;
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if(sg == null)
		{
			sg = new Singleton();
		}
		return sg;
	}
}