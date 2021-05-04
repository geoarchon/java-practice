import java.util.*;
class sparsematrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int z=0,c=0,i,j;
        System.out.println("Enter numbers");
        for(i=0;i<m;i++)//to take input
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==0)//to count number of zeroes 
                    z++;
                else//to count number of non-zero elements
                    c++;
            }
        if(z>c)
            System.out.println("It is a sparse matrix\n");
        else
            System.out.println("It is not a sparse matrix\n");
        System.out.println("The non-zero elements are:\n");
        System.out.println("Row\tColumn\tValue");
        for(i=0;i<m;i++)//to display non-zero elements
            for(j=0;j<n;j++)
                if(a[i][j]!=0)
                    System.out.println((i+1)+"\t"+(j+1)+"\t"+a[i][j]);
    }
}
