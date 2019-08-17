import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	MyCalculator c=new MyCalculator();
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number(1-1000)= ");
	int n=sc.nextInt();
	System.out.println("the sum of the factors of the entered number is= " +c.SumOfFactors(n));
	}
}