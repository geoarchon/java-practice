class Node
{
    int n;
    Node next;
    Node()//default constructor
    {
        n=0;
        next=null;
    }
    public Node GetNode(int i)//creates nodes
    {
        Node N=new Node();
        N.n=i;
        return N;
    }
}