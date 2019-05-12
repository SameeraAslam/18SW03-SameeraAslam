
public class Author{
private String name;
private String email;
private char gender;
public Author(String name, String email, char gender)
{
this.name=name;
this.email=email;
this.gender=gender;
}
public String getName()
{ return name;
}
public String getEmail()
{ return email;
}
public void setEmail(String email)
{ this.email=email;
}
public char getGender()
{ return gender;
}
public String toString()
{
return("Author[name=" +name + ", Email=" +email + ", Gender=" +gender + "]") ;
}
}
 class Ran{
public static void main(String args[]){
Author a1=new Author("Sameera", "Sameera@gmail.com", 'f');
String name=a1.getName();
String email=a1.getEmail();
a1.setEmail("Sameera@gmail.com");
char gen=a1.getGender();
String a=a1.toString();
System.out.println(a); 
}
}