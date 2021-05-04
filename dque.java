import java.util.*;
class dque //output restricted
{
    //data members
    int arr[];
    int front;
    int rear;
    int size;
    dque(int x) //parameterised constructor
    {
        size=x;
        arr=new int[x]; 
        front=-1;
        rear=-1;
    }

    void insertrear(int e) //to insert elements from the rear
    {
        if(rear==size-1)
            System.out.println("Overflow at rear");
        else if(rear==-1)
        {
            front=0;
            rear=0;
            arr[rear]=e;
        }
        else
            arr[++rear]=e;
    }

    void insertfront(int e) //to insert elements from the front
    {   
        if(front==0)
            System.out.println("Overflow at front");
        else if(front==-1)
        {   
            front=0;
            rear=0;
            arr[front]=e;
        }
        else
            arr[--front]=e;
    }  

    
    void removefront() //to remove from the front
    {
        if(front==-1)
            System.out.println("Underflow at front");
        else
        {
            int e;
            if(front==size-1||front==rear)
            {
                e=arr[front];
                rear=-1;
                front=-1;
            }
            else
                e=arr[front++];
            System.out.println("Element deleted: "+e);    
        }   
    }

    void display() //to display the queue
    {
        if(front==-1 && rear==-1)
            System.out.println("Queue is empty");
        else
            for(int i=front;i<=rear;i++)
                System.out.print(arr[i]+"\t");
    }

    public static void main() //to take user input and choice
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int s=sc.nextInt();
        int x;
        dque d=new dque(s);
        while(true) //runs while the user keeps providing input
        {   
            System.out.println();
            System.out.println("\n1.Insert at rear\n2.Insert at front\n3.Delete at front\n4.Display\n5.Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter element");
                    x=sc.nextInt();
                    d.insertrear(x);
                    break;
                case 2: 
                    System.out.println("Enter element");
                    x=sc.nextInt();
                    d.insertfront(x);
                    break;
                case 3: 
                    d.removefront();
                    break;
                case 4: 
                    d.display();
                    break;
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
            }
        }
    }
}