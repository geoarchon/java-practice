import java.util.*;
class Disarium
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int i, x=0;
    int z=reverse(n);
    for(i=1;z>0;i++,z/=10)
        x+=Math.pow(z%10,i); 
    if(x==n) 
      System.out.println("Disarium");
    else
      System.out.println("Not Disarium");
      
  }
  static int reverse(int n) 
  {
    int s=0;
    while(n>0)
    {
      s=s*10+n%10;
      n/=10;
    }
    return s;
  }
} 
    
