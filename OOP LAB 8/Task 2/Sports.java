import java.util.Scanner;
class Sports
{
public String getName()
	{
	return "Generic sports";
	}
public void getNumberOfTeamMembers()
	{
	System.out.println("each team has n players in " +getName()); 
	}
}
class Cricket extends Sports
{
Scanner ob=new Scanner(System.in);

public String getName()
			{
			return "cricket";
			}
public void getNumberOfTeamMembers()
		{
		System.out.println("Enter number of players= ");
		int n=ob.nextInt();
		System.out.println("each team has "+ n+" players in " +getName()); 
		}	
}
class Soccer extends Sports
{
Scanner ob=new Scanner(System.in);
public String getName()
			{ 
			return "Soccer" ;
			}
public void getNumberOfTeamMembers()
		{
		System.out.println("Enter number of players=");
     		int n=ob.nextInt();
		System.out.println("each team has "+ n+" players in " +getName());
		}
}