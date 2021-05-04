import java.util.*;
class circularqueue
{
    //data members
    int arr[];
    int front;
    int rear;
    int size;
    circularqueue(int s)//parameterised constructor
    {
        size=s;
        arr=new int[s];
        front=-1;
        rear=-1;
    }
    void insert(int e)//to insert elements
    {
        if(front==rear+1||front==0&&rear==size-1)
            System.out.println("Queue full");
        else if(rear==-1)
        {
            front=0;
            rear=0;
            arr[rear]=e;
        }
        else if(front>0&&rear==size-1)
        {
            rear=0;
            arr[rear]=e;
        }
        else
            arr[++rear]=e;
    }
    void remove()//to delete elements
    {
        if(front==-1&&rear==-1)
            System.out.println("Underflow");
        else
        {
            int x=arr[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else
            if(front==size-1)
                front=0;
            else
                front++;
            System.out.println("Element deleted: "+x);
        }
    }
    void display()//to display the queue
    {
        int i;
        if(front==-1&&rear==-1)
            System.out.println("Queue is empty");
        if(rear>front)
        {
            System.out.println();
            for(i=front;i<=rear;i++)
                System.out.print(arr[i]+"\t");
        }
        if(front>rear)
        {
            System.out.println();
            for(i=0;i<=rear;i++)
                System.out.print(arr[i]+"\t");
            for(i=front;i<=size-1;i++)
                System.out.print(arr[i]+"\t");
        }
    }
    public static void main()//to take user input and choice
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int s=sc.nextInt();
        circularqueue cq=new circularqueue(s);
        while(true)//runs while the user keeps providing input
        {
            System.out.println("\n1. Insert\n2. Delete\n3. Display\n4. Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter element to add");
                    int x=sc.nextInt();
                    cq.insert(x);
                    break;
                case 2:
                    cq.remove();
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
            }
        }
    }
}