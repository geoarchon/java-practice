import java.util.*;
public class longestpalindrome {

    public static void main(String [] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        int i,j,n=s.length(),l=0;
        String longest="";
        for(i=0;i<n;i++)
        {   
            for(j=n;j>=i;j--)   
            {
                String w=s.substring(i,j);
                if(isPalindrome(w))
                {    
                    if(w.length()>l)
                    {
                        longest=w;
                        l=w.length();
                    }
                    break;
                }
            }    
        }
        System.out.println(longest+"\t"+l);
    }
    public static boolean isPalindrome(String x)
    {
        int d=x.length();
        int i;
        for(i=0;i<d/2;i++)
            if(x.charAt(i)!=x.charAt(d-i-1))
                return false;
        return true;
    }
}