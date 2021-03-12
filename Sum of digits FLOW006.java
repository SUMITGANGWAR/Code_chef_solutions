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
	 int i,a;
	 int sum=0;
	 if(1<=T && T<=1000){
	  for(i=1;i<=T;i++){
	      int N=sc.nextInt();
	      while(N>0){
	          a=N%10;
	          sum=sum+a;
	          N=N/10;
	      }
	     System.out.println(sum);
	     sum=0;
	  }
	 }
	}
}