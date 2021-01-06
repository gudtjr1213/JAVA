package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args)
	{
		int star = 4;
		for(int i=0; i<star; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}	

		for(int i=1; i<=star; i++)
		{
			for(int z=star; z>0; z--)
			{
				System.out.print(i<z ? "" : "*");
//				if(i<z)
//				{
//					System.out.print("");
//				}
//				else
//					System.out.print("*");
			}
			System.out.println();
		}	
	}
}
