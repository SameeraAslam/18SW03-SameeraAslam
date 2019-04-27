class Search
{  
   public static void main(String args[])
   {
   int array[]={1,2,3,4,5};
    int num=Integer.parseInt(args[0]);
	for(int i=0;i<array.length;i++)
             {
                	   if(num==array[i])
	   {
	           System.out.println("The number's position is at"+(i+1));
	           break ;
	   }	   
	                   if(num==array.length)
	   {
	           System.out.println("value is not found. ");
	   }
              }
   }  
}