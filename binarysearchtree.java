import java.util.*;
public class BST
{
    TNode Root;
    public void create(TNode Root,int e)//creating a binary search tree
    {
        TNode T1=new TNode();
        TNode R=Root,R1=Root;
        T1=T1.GetNode(e);
        while(true)//creating the branches
        {
            if(T1.n>R.n)     
            {                 
                if(R.RTree!=null)
                    R=R.RTree;
                else
                    R.RTree=T1;              
                    break;
            }
            else
            {
                if(R.LTree!=null)  
                    R=R.LTree;
                else
                {
                    R.LTree=T1;             
                    break;
                }
            }
        }
    }
    public void inorder(TNode Root)//InOrder traversal: left root right
    {
        if(Root==null)
            return;
        inorder(Root.LTree);
        System.out.print(Root.n+"\t");
        inorder(Root.RTree);
    }
    public void main() //calls the other functions
    {
        Scanner sc=new Scanner(System.in);
        TNode T1=new TNode();
        BST T=new BST();
        System.out.println("\nEnter root value ");
        int x=sc.nextInt();
        T1=T1.GetNode(x);
        if(Root==null)
            Root=T1;
        int y=1;
        while(true)
        {
            System.out.println("Enter element to insert");
            int e=sc.nextInt();
            T.create(Root,e);
            System.out.println("Enter -1 to break, any other value to continue");
            y=sc.nextInt();
            if(y==-1)
                break;
        }
        System.out.println("Tree elements:");
        T.inorder(Root);
    }
}