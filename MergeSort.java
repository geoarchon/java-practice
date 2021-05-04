import java.util.*;
class MergeSort
{
    int arr[];
    int n;
    MergeSort(int l)
    {   
        arr=new int[l];
        n=l;
    }
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    public void Display()
    {
        System.out.println("The elements are: ");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+"\t");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int l=sc.nextInt();
        System.out.println("Enter size of 2nd array");
        int p=sc.nextInt();
        MergeSort m1=new MergeSort(l);
        MergeSort m2=new MergeSort(p);
        MergeSort m3=new MergeSort(l+p);
        m1.Input();
        m2.Input();
        m1.Display();
        m2.Display();
        m3=m1.Merge(m2);
        m3.Display();
    }
    public MergeSort Merge(MergeSort m)
    {
        MergeSort m3=new MergeSort(arr.length+m.arr.length);
        int i=0,j=0,k=0;
        while(i<arr.length&&j<m.arr.length)
        {
            if(arr[i]>m.arr[j])
                m3.arr[k++]=m.arr[j++];
            else if(arr[i]<m.arr[j])
                m3.arr[k++]=arr[i++];
            else
            {   
                m3.arr[k++]=arr[i++];
                m3.arr[k++]=m.arr[j++];
            }
        }
        if(i==arr.length)
            while(j<m.arr.length)
                m3.arr[k++]=m.arr[j++];
        else if(j==m.arr.length)
            while(i<arr.length)
                m3.arr[k++]=arr[i++];
        return m3;
    }
}