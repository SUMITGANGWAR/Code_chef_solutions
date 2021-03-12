/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int k=sc.nextInt();
	 int num=0;
	 int i;
	 if(n<=10000000 && k<=10000000){
	 for(i=1;i<=n;i++){
	     int zi=sc.nextInt();
	     if(zi%k==0){
	         num++;
	     }
	 }
	 System.out.print(num);
	 }
	 
		
	}
}