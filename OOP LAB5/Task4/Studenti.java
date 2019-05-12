public class Studenti
{
private String name;
private int age;
private String rollno;
private String dept;
private String uni;
private String batch; 

public void Student(String name, int age, String rollno)
{
name=name;
age=age;
rollno=rollno;
}
public void SetDetails(String dept, String uni ,String batch)
{
dept=dept;
uni=uni;
batch=batch;
}
public void ShowDetails()
{
System.out.println("NAME:" +name);
System.out.println("ROLLNO:" +rollno);
System.out.println("AGE:" +age);
System.out.println("DEPARTMENT:" +dept);
System.out.println("BATCH:" +batch);
System.out.println("UNIVERSITY:" +uni);
} 
}





