public class Student{
  String name ;
  String address ;
  int age ;

public Student(String name, String address, int age)
{
this.name= name ;
this.address= address;
this.age= age; 
}

  public void Setinfo(String n, int a){
     name=n;
     age=a;
   System.out.println("Name=" +n);
   System.out.println("Age=" +a);
  }

  public void Setinfo(String addr)
  {
   address=addr;
   System.out.println("Address=" +addr);
   }
 }
  class Stu{
 public static void main(String args[])
 {
  
   Student[] sd = new Student[5];
   sd[0] = new Student("unknown", "na", 0);
   sd[1] = new Student("unknown", "na", 0);
   sd[2] = new Student("unknown", "na", 0);
   sd[3] = new Student("unknown", "na", 0);
   sd[4] = new Student("unknown", "na", 0);


   sd[0].Setinfo("Ali", 20);
   sd[0].Setinfo("Hyderabad");

   sd[1].Setinfo("Sana", 10);   
   sd[1].Setinfo("Hyderabad");

   sd[2].Setinfo("Sameera", 19);
   sd[2].Setinfo("Naran");

   sd[3].Setinfo("Saif", 20);
   sd[3].Setinfo("lahore");

   sd[4].Setinfo("Aliza", 20);
   sd[4].Setinfo("Punjab");
 }
}