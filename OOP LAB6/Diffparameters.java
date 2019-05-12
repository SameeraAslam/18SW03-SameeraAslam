public class Diffparameters{

public void Method( int i, char ch)
{
System.out.println("i=" +i + ", char= " +ch);
}
public void Method(char ch, int i)
{
System.out.println("char=" +ch + ", int= " +i);
}
}
 class Diffpara{
public static void main(String args[]){
Diffparameters a1=new Diffparameters();
a1.Method(34, 'F');
a1.Method('F', 34);
} 
}