public class Marksheet{
int maths;
int eng;
int cp;
int result;
double p;
public void Totalmarks()
{
result=maths+eng+cp;
System.out.println("Result=" +result);
}
public void Percentage(){
p=(result*100.0)/300.0;
System.out.println("Percentage=" +p);

}
public void grade()
	{
		if(p>90)
		System.out.println("grade=A");
		else if(p>=80 && p<=90)
		System.out.println("grade=B");
		else if(p>=70 && p<80)
		System.out.println("grade=C");
		else if(p>=60 && p<70)
		System.out.println("grade=D");
		else if(p<60)
		System.out.println("FAIL");
	}
}
