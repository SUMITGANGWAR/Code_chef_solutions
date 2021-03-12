/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double y=sc.nextDouble();
		double x=sc.nextDouble();
		if(y%5==0&y+.50<=x){
		    if(0<x&x<=2000){
		        double z=x-y-.50;
		        System.out.print(z);
		    }
		}    
		else{
		  System.out.print(x);
		    }
	}
}


