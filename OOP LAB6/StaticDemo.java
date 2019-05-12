public class StaticDemo{
static String name;
static void getinfo()
{
System.out.println("name=" +name);
}
}
 class Mainclass{
public static void main(String args[]){
StaticDemo.name="Sameera";

StaticDemo.getinfo();

}
}
