package assignment_java;

public class MyCalculator 
{
 int num1;
 int num2;
 
 public MyCalculator(int num1,  int num2)
 {
	 this.num1=num1;
	 this.num2=num2;
 }
 public static void main(String []args)
 {
	
  MyCalculator m1= new MyCalculator(46,8);
 Calculated.calculate(m1.num1, m1.num2);
}
}