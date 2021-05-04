import java.util.*;
class keith
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); //for input
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int copy=n,ctr=0;
        while(copy>0) //counts no. of digits
        {
            copy/=10;
            ctr++;
        }
        int a[]=new int[ctr];//to store three numbers in the required series at a time
        copy=n;
        int x=ctr,c=0,f=0,i,j;
        while(copy>0) //stores digits in array
        {
            a[--x]=copy%10;
            copy/=10;
        }
        for(i=0;n>c;i++) //generates required series provided the given number is not surpassed
        {
            c=0;
            for(j=0;j<ctr;j++)
                c+=a[j];
            for(j=0;j<ctr-1;j++)//to generate the following numbers in the series
                a[j]=a[j+1];
            a[ctr-1]=c;
            if(c==n)
            {   
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("The number is Keith");
        else
            System.out.println("The number is not Keith");
    }
}
        
               
        