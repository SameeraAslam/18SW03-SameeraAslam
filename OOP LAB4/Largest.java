import java.util.Scanner;
public class Largest {
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);

System.out.println("Enter no of elements");
int size=obj.nextInt();
int numArray[]=new int[size];
System.out.println("Enter elements");
for(int i=0; i<size;i++)
{ numArray[i]=obj.nextInt();} 
        int largest = numArray[0];
        for (int i=0; i<size; i++) {
            if(numArray[i]>= largest)
               { largest = numArray[i];}
        }

        System.out.println("Largest element =" +  largest);
    }
}