import java.util.*;
class InsertionSort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,temp=0;
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++)//for taking array elements as input
            a[i]=sc.nextInt();
        for(i=1;i<a.length;i++)//for sorting through insertion sort
        {
            temp=a[i];
            for(j=i-1;j>=0&&temp<a[j];j--)//inner loop for insertion sort
                a[j+1]=a[j];
            a[j+1]=temp;
        }
        System.out.println("Elements of sorted array: ");
        for(i=0;i<a.length;i++)//for printing sorted array
            System.out.print(a[i]+"\t");
    }
}