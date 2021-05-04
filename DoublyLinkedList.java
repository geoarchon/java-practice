import java.util.*;
class DList
{
    DNode head;
    DNode ptr;
    DList()//default constructor
    {
        head=null;
        ptr=null;
    }
    public void Create()//to create doubly linked list
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\nEnter element");
            int e=sc.nextInt();
            DNode N=new DNode();
            N=N.GetNode(e);
            if(head==null)
            {
                head=N;
                ptr=N;
            }
            else//each node gets linked to the one before it and after it
            {
                ptr.next=N;
                N.prev=ptr;
                ptr=N;
            }
            System.out.println("Enter -1 to break, any other number to continue.");
            int a=sc.nextInt();
            if(a==-1)
                break;
        }
    }
    public void Display()//to display doubly linked list
    {
        DNode h=head;
        System.out.println("Linked list:");
        while(h!=null)
        {
            System.out.print(h.n+"\t");
            h=h.next;
        }
    }
    public static void main()//to call other functions
    {
        DList l=new DList();
        l.Create();
        l.Display();
    }
}
