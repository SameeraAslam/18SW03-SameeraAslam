public class Area{
public void A1(double length, double breadth)
{
System.out.println("AREA OF RECTANGLE=" +(length*breadth) + "squnits");
}
public void A1(double side)
{
System.out.println("AREA OF SQUARE=" +(side*side) + "squnits");
}
}

class AR{
public static void main(String args[]){
Area a1= new Area();
a1.A1(34.67, 78.78);
a1.A1(67.8); 
}
}