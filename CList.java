import java.util.*;
class CList
{
    CNode head;
    CNode ptr;
    CList()//default constructor
    {
        head=null;
        ptr=null;
    }
    public void Create()//creates circular linked list
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\nEnter element");
            int e=sc.nextInt();
            CNode N=new CNode();
            N=N.GetNode(e);
            if(head==null)
            {
                head=N;
                ptr=N;
            }
            else
            {
                ptr.next=N;
                ptr=N;
                ptr.next=head;
            }
            System.out.println("Enter -1 to break, any other number to continue.");
            int a=sc.nextInt();
            if(a==-1)
                break;
        }
    }
    public void Display()//displays circular linked list
    {
        CNode h=head;
        System.out.println("Circular linked list:");
        do
        {
            System.out.print(h.n+"\t");
            h=h.next;
        }
        while(h!=head);
    }
    public static void main()//calls to other functions
    {
        CList l=new CList();
        l.Create();
        l.Display();
    }
} 