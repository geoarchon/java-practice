import java.util.*;
class lcs
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 words");//for user input
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int i,j,max=0;
        String m="";
        for(i=0;i<s1.length();i++)//outer loop
            for(j=s1.length()-1;j>=i;j--)//inner loop 
            {
                String w=s1.substring(i,j+1);//creates substrings from s1
                if(s2.indexOf(w)!=-1)//checks whether the substring from s1 is found in s2
                    if(w.length()>max)//checks for the longest common substring
                    {
                        max=w.length();
                        m=w;
                    }
            }
        if(m!="")
            System.out.println("Longest common substring: "+m);
        else
            System.out.println("No common substring");
    }
}
            
            
        