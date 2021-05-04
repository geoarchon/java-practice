import java.util.*;
class enque //input restricted
{ 
    //data members
    int arr[];
    int front;
    int rear;
    int size;
    enque(int x)//parameterised constructor
    {
        size=x;
        arr=new int[x]; 
        front=-1;
        rear=-1;
    }

    void insertrear(int e)//to insert from the rear
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

    void removerear()//to remove from the rear
    {
        if(rear==-1)
            System.out.println("Underflow at rear");
        else
        {   
            int e;
            if(front==rear)
            {
                e=arr[rear];
                rear=-1;
                front=-1;
            }
            else
                e=arr[rear--];
            System.out.println("Element deleted: "+e);
        }
    }

    void removefront()//to remove from the front
    {
        if(front==-1)
            System.out.println("Underflow at front");
        else
        {
            int e;
            if(front==rear)
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

    void display()//to display the queue
    {
        if(front==rear)
            System.out.println("Queue is empty");
        else
            for(int i=front;i<=rear;i++)
                System.out.print(arr[i]+"\t");
    }

    public static void main()//to take user input and choice
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int s=sc.nextInt();
        int x;
        enque d=new enque(s);
        while(true)//runs while user keeps providing input
        {   
            System.out.println("\n1.Insert at rear\n2.Delete at rear\n3.Delete at front\n4.Display\n5.Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter element");
                    x=sc.nextInt();
                    d.insertrear(x);
                    break;
                case 2:
                    d.removerear();
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