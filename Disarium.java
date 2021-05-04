import java.util.*;
class Disarium
{
    int n;
    Disarium()
    {
        n=0;
    }
    void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
    }
    int count(int x) //to count the number of digits
    {
        if(x==0)
            return 0;
        else
            return 1+count(x/10);
    }
    int power(int x, int y) //recursive function to generate the powers
    {
        if(y==0)
            return 1;
        else
            return x*power(x,y-1);
    }
    void Check() // to check if the number is disarium
    {
        int x=count(n);
        int copy=n,r,s=0;
        while(copy>0) //the digits are provided with powers according to their positions in the number and added
        {   
            r=copy%10;
            s+=power(r,x);
            copy/=10;
            x--;
        }
        if(s==n)
            System.out.println("The number is disarium");
        else    
            System.out.println("The number is not disarium");
    }
    public static void main()//for object creation and method call
    {
        Disarium d=new Disarium();
        d.Input();
        d.Check();
    }
}