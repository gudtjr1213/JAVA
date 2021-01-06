package com.kita.first;

public class For2 {
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int n=0;n<3;n++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.printf("%d, %d, %d\n", i ,n, j);
				}
			}
		}
		
	}
}
