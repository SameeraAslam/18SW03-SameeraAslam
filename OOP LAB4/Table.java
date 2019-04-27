import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("ENTER TABLENO");
int tbno=obj.nextInt();
System.out.println("ENTER STARTING POINT");
int startpoint=obj.nextInt();
System.out.println("ENTER ENDING POINT");
int endpoint=obj.nextInt();
for(int i=startpoint; i<=endpoint; i++){
System.out.println(tbno + "*" + i + "=" + (tbno*i));}
} }

