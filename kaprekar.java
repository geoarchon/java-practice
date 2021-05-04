import java.util.*;
class kaprekar
{   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String s=String.valueOf(n*n);//converts number to string
        int l=s.length();//length of number
        int x=Integer.valueOf(s.substring(0,l/2));//stores 1st half of the number
        int y=Integer.valueOf(s.substring(l/2));//stores 2nd half of the number
        int f=x+y;//checks if both halves are equal
        if(f==n)
            System.out.println("Number is Kaprekar");
        else
            System.out.println("Number is not Kaprekar");
    }
}