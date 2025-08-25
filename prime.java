public class prime
{
 public static void main(String[] args) 
{
System.out.print("Prime numbers from 1 to 500 are:");
for (int i = 2; i <= 500; i++) 
{
if (isPrime(i)) 
{
System.out.print(i + " ");
}
}
}
public static boolean isPrime(int num) 
{
if (num<2) 
return false;         
for (int i=2; i<= Math.sqrt(num); i++) 
{
if (num % i == 0)               
return false;
}
return true;     
}

}

