import java.util.Scanner;
public class Taskinput{
public static void main(String args[]){
String a,b;
Scanner obj= new Scanner(System.in);
System.out.print("Enter your Name:");
a=obj.nextLine();
System.out.print("Enter your Rollno:");
b=obj.nextLine();
System.out.println("Name=" +a);
System.out.println("Rollno=" +b);
 }
}