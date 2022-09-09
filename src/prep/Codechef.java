package prep;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc=new Scanner (System.in);
		int A=Sc.nextInt();
		int B=Sc.nextInt();
		int X=0;
		for (int i=1;i<= A || i <= B;i++)
		{
			if (A%i ==0 && B%i==0)
			{
				X=i;
			}
		}
		System.out.println(X);
	}

}
