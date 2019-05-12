class Mark
{ 
			public static void main(String args[])
 			{
			Student s1=new Student("Samira","18sw03",19);
			Marksheet m1=new Marksheet();
			m1.java=78;
			m1.cpp=90;
			m1.maths=89;
			Result r1=new Result(s1,m1);
	                                r1.createStudentResult();
			}
}