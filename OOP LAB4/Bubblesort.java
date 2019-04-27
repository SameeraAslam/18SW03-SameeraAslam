class Bubblesort
{
public static void main(String args[])
  {
int cont=0;
int ptr;
int k;
   int data[]={20,7,6,5,4};
   int N=data.length;
   for( k=1;k<N;k++)
      { ptr=0;
 while(ptr<N-k)
{
if(data[ptr]>data[ptr+1])  {
 cont=data[ptr];
  data[ptr]=data[ptr+1];
  data[ptr+1]=cont;
} ptr=ptr+1;
 }
}
for( k=0;k<N;k++)
{
System.out.print(data[k]+" ");
}
 }
} 