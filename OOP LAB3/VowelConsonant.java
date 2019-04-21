import java.util.Scanner;
public class VowelConsonant{ 
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter a character");
char ch=obj.next().charAt(0);
switch(ch){   
case 'a': System.out.println("VOWEL");
break;
case 'e': System.out.println("VOWEL");
break;
case 'i': System.out.println("VOWEL");
break;
case 'o': System.out.println("VOWEL");
break;
case 'u': System.out.println("VOWEL");
break;
default: System.out.println("COCONANT");
break;
}
}
}