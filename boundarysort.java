import java.util.*;
class boundarysort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions of the array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n],i,j;
        System.out.println("Enter numbers");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)

                a[i][j]=sc.nextInt();
        System.out.println("\nOriginal array\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");                 
            System.out.println();
        }
        int arr[]=new int[2*m+2*(n-2)];
        int k=0;
        for(i=0;i<m;i++)//for storing boundary elements in 1D array
        {
            if(i==0||i==(m-1))
                for(j=0;j<n;j++)
                    arr[k++]=a[i][j];
            else
            {
                arr[k++]=a[i][0];//for first column
                arr[k++]=a[i][n-1];//for last column
            }
        }
        for(i=0;i<k-1;i++)//sorting boundary elements
            for(j=0;j<k-i-1;j++)		
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        int b[][]=new int[m][n];
        k=0;
        //storing boundary elements in clockwise manner
        for(i=0;i<n;i++)//first row
           b[0][i]=arr[k++];
        for(i=1;i<m;i++)//righthand column
            b[i][n-1]=arr[k++]; 
        for(i=n-2;i>=0;i--)//last row
            b[m-1][i]=arr[k++];

        for(i=m-2;i>0;i--)//lefthand column
            b[i][0]=arr[k++];
        System.out.println("\nRearranged matrix:\n");
        for(i=0;i<m;i++)//displaying final matrix
        {
            for(j=0;j<n;j++)
            {
                if(b[i][j]==0)
                    System.out.print("\t");//displays blank spaces
                else
                    System.out.print(b[i][j]+"\t");//displays boundary elements
            }
            System.out.println();
        }
    }
}