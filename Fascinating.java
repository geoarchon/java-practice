import java.util.*;
class Fascinating
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String ns="";
        int i,f=1;
        for(i=1;i<4;i++) 
            ns+=n*i; //concatenates the number with its double and treble
        for(i=1;i<10;i++) //to check if all digits from 1-9 is present in the string
        {   
            if(ns.indexOf((char)(i+48))==-1) //if any digit between 1-9 is not present, break
            {
                f=0;
                break;
            }
        }
        if(f==0)
            System.out.println("Number is not Fascinating");
        else
            System.out.println("Number is Fascinating");
    }
}