class A{
public void Method1()
{
System.out.println("Method 1");
}
final public void Method2()
{
System.out.println("Method 2");
}
}
//Method2 will not be overriden because of final keyword
class B extends A{
public void Method1()
{
System.out.println("Method1 can be overriden");
}
}