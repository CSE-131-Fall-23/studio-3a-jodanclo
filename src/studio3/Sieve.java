package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is n?");
		int n = in.nextInt();
		
		boolean list [] = new boolean [n+1];
		
		for(int i =0; i<=n; i++)
		{
			list[i] = true;
		}
		
		for(int i =2; i<=n; i++)
		{
			for(int j =2; j<=n; j++)
			{
				if(i != j) {
					if(j%i == 0)
					{
						list[j]= false;
					}
				}
			}
		}
		for(int k =2; k<=n; k++)
		{
			if(list[k] == true) 
			{
				System.out.println(k);
			}
		}
	}

}
