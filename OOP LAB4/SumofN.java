import java.util.Scanner;
class SumofN{
public static void main(String args[]){
int sum=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter size of array");
int size=obj.nextInt();
int a[]=new int[size];
System.out.println("enter elements of array");
for(int i=0; i<size; i++){
a[i]=obj.nextInt();
}
int i=0;
while(i<size){
sum=sum+a[i];
i++;
}
System.out.println("Sum is="+sum); 
}
 }


