import java.util.Scanner;
interface AdvancedArthmetic
{
public int SumOfFactors(int n);
}
class MyCalculator implements AdvancedArthmetic{
public int SumOfFactors(int n){
int a=0; 
for(int i=1; i<=n; i++){
 if(n%i==0)
{
a= a+i; }
}
return a; 
} 
}
