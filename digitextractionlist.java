import java.util.*;
class digitext
{
    Node head;
    digitext()//default constructor
    {
        head=null;
    }
    public void Create()//creates linked list from extracted digits
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a number");
        int n=sc.nextInt();
        int copy=n,d;
        while(copy>0)//to extract digits and create nodes from them
        {   
            d=copy%10;
            Node N=new Node();
            N=N.GetNode(d);
            N.next=head;
            head=N;
            copy/=10;
        }
    }
    public void Display()//prints list
    {
        Node h=head;
        System.out.println("Linked list:");
        while(h!=null)
        {
            System.out.print(h.n+"\t");
            h=h.next;
        }
    }
    public static void main()//calls other functions
    {
        digitext d=new digitext();
        d.Create();
        d.Display();
    }
}