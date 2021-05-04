import java.util.*;
class  SetInt
{
    int arr[];
    int n;
    SetInt(int x)//parameterised constructor
    {
        n=x;
        arr=new int[n];
    }
    void Input()//takes input for the arrays
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements for the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    void Display()//displays the arrays
    {
        System.out.println("\nThe elements: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"\t");
    }
    SetInt fnintersect(SetInt A)//intersects the sets
    {
        SetInt B=new SetInt(A.n+n);
        int k=0;
        for(int i=0;i<A.n;i++)
            for(int j=0;j<n;j++)
                if(A.arr[i]==arr[j])
                    B.arr[k++]=A.arr[i];
        B.n=k;
        return B;
    }
    public static void main()//for creating objects and invoking member functions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st set:");
        int l1=sc.nextInt();
        System.out.println("Enter size of 2nd set:");
        int l2=sc.nextInt();
        SetInt S=new SetInt(l1);
        SetInt I=new SetInt(l2);
        S.Input();
        I.Input();
        S.Display();
        I.Display();
        SetInt G=new SetInt(l1+l2); //object which is the required array
        G=S.fnintersect(I);
        G.Display();
    }
}