import java.util.*;
class Union
{
    int arr[];
    int n;
    Union(int l)//parameterised constructor
    {
        n=l;
        arr=new int[n];
    }
    void Input()//takes user input of the arrays' elements
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    void Display()//displays the arrays
    {
        System.out.println("\nThe elements: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"\t");
    }
    Union SetUnion(Union S)//unites the two sets as required
    {
        Union A=new Union(n+S.n);
        int k=0,f=0,i;
        for(i=0;i<n;i++)
            A.arr[k++]=arr[i];
        for(i=0;i<S.n;i++)
        {
            for(int j=0;j<n;j++)
                if(A.arr[j]==S.arr[i])
                    f++;
            if(f==0)
                A.arr[k++]=S.arr[i];
            f=0;
        }
        A.n=k;
        return A;
    }
    public static void main()//creates objects and invokes other member functions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions of the 1st array: ");
        int m=sc.nextInt();
        System.out.println("Enter dimensions of the 2nd array: ");
        int n=sc.nextInt();
        Union S1=new Union(m);
        Union S2=new Union(n);
        Union S3=new Union(m+n);
        S1.Input();
        S2.Input();
        S1.Display();
        S2.Display();
        S3=S1.SetUnion(S2);
        S3.Display();
    }
}