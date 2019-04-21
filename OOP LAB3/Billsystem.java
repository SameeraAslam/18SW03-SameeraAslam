import java.util.Scanner;
class Billsystem{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("ENTER CONSUMED UINITS" );
int unit=obj.nextInt();
int total;
   if(unit<=50)      {
	  total=10*unit;
	  System.out.println(total+" rs");
	  }
    else if( unit>50 && unit<=100 )       {
	  total=15*unit;
	  System.out.println(total+" rs");
	  }
	else if( unit>100 && unit<=200 )   {
	  total=20*unit;
	  System.out.println(total+" rs");
	  }
	else if( unit>200 && unit<=300 )   {
	  total=25*unit;
	  System.out.println(total+" rs");
	  }
	  else if( unit>300 )    {
	  total=30*unit;
	  System.out.println(total+" rs");
	  }   
   }
}

