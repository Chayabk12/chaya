package assignment_java;

import java.util.Scanner;

public class Calculated 
{
  public static void calculate(int num1, int num2)
  {
	  System.out.println("Enter your choice among the options below");
	  System.out.println("+: addition. -: subtraction. *: multiplication.  /: Division");
	  Scanner input = new Scanner(System.in);
	  String choice= input. next() ;
	  double result;
	  switch (choice)
	  {
	  case("+"):
	  {
		 System.out.println( result=num1+num2); 
		 break;
	  }
	  case("-"):
		 {
		  
		  if(num1>num2)
		  {
			 System.out.println(result= num1-num2);  
		  }
		  else
		  {
			 System.out.println(result=num2-num1); 
		  }
		  break;
		 }
		  case("*"):
		  {
			System.out.println(result= num1*num2); 
		  }
		  case("/"):
		  {
			  if(num2==0) {
				  System.out.println("error");
			  }
			  else
			  {
				  System.out.println(result=num1/num2);
			  }
			  }
		  }
		  
	  }
	  }
	  
  

