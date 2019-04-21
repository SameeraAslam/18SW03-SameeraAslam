public class Addsubmultidivi{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
char c=args[1].charAt(0);
int b=Integer.parseInt(args[2]);

int operation;
 if(c=='+')
	 {
	 operation=a+b;
	 System.out.println("ADDITION= "+operation);
	 }
	 else if(c=='-')
	 {
	 operation=a-b;
	 System.out.println("SUBTRACTION= "+operation);
	 }
	 else if(c=='*')
	 {
	 operation=a*b;
	 System.out.println("MULTIPLICATION= "+operation);
	 }
	 else if(c=='/')
	 {
	 operation=a/b;
	 System.out.println("DIVISION= "+operation);}
} 
}