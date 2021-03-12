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
	 int T=sc.nextInt();
	 int i;
// 	 int sum=0;
	 if(1<=T && T<=1000){
	     for(i=1;i<=T;i++){
	         int A=sc.nextInt();
	         int B=sc.nextInt();
	         if(A<=10000 && B<=10000){
	              System.out.println(A%B);
	         }
	     }
	     
	  }
	  
	
	 }
	}