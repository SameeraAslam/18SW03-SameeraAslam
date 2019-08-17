class Main{
public static void main(String args []){
        Sports p=new Sports();
	Cricket c=new Cricket();
	Soccer s=new Soccer();
	
	Sports r;
	r=c;
	System.out.println("Name of Game is= "+r.getName());
	r.getNumberOfTeamMembers();
	r=s;
	System.out.println();
	System.out.println("Name Of Game is= "+r.getName());
	r.getNumberOfTeamMembers();
	}
}