import java.util.Scanner;
public class Marksheet{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("ENTER MARKS IN C++");
int cpp=obj.nextInt();
System.out.println("ENTER MARKS IN DATA STRUCTURE");
int dst=obj.nextInt();
System.out.println("ENTER MARKS IN OPERATING SYSTEM");
int ops=obj.nextInt();
int sum=cpp+dst+ops;
double percent=sum*100/300;
System.out.println("PERCENTAGE="+percent);
if(percent>=90)
      {
	  System.out.println("GRADE A");
      }
   else if(percent>=80 && percent<90)
      {
	  System.out.println("GRADE B");
      }
   else if(percent>=70 && percent<80)
      {
	  System.out.println("GRADE C");
      }
	else if(percent>=60 && percent<70)
      {
	  System.out.println("GRADE D");
	  }
	  
	  else if(percent<60)
	  {
	  System.out.println("FAIL");
	  }     
   }
}

