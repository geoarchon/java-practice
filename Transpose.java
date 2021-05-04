import java.util.*;
class Transpose
{
    int arr[][];
    int r;
    int c;
    Transpose(int m, int n)//parameterised constructor
    {
        r=m;
        c=n;
        arr=new int[r][c];
    }
    void Input()//takes user input of matrix elements
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
    }
    void Display()//displays matrix elements 
    {
        System.out.println("The matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    Transpose Find()//transposes the matrix as required
    {
        Transpose t2=new Transpose(c,r);
        int a[]=new int[r*c];
        int i,j,k=0;
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                a[k++]=arr[i][j];
        k=0;
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                t2.arr[j][i]=a[k++];
        return t2;
    }
    public static void main()//creates objects and invokes other member functions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions of the matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        Transpose t1=new Transpose(m,n);
        t1.Input();
        t1.Display();
        Transpose t2=new Transpose(n,m);
        t2=t1.Find();
        t2.Display();
    }
}