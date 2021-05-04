import java.util.*;
class pendulum
{   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int i,temp,j, a[]=new int[n];
        System.out.println("Enter numbers");
        for(i=0;i<n;i++)//takes input
            a[i]=sc.nextInt();
        for(i=0;i<n-1;i++)//sorts elements in descending order
            for (j=0;j<n-i-1;j++) 
                if (a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
        int b[]=new int[n];
        b[n/2]=a[0];
        int k=n/2,s=-1;
        for(i=1;i<n;i++)//
        {   
            b[k+s*i]=a[i];
            if(i%2!=0)
                k-=i;
            else
                k+=i;
            s=s*(-1);    
        }
        System.out.println();
        for(i=0;i<n;i++)
            System.out.print(b[i]+"\t");
    }
}


