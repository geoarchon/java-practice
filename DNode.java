class DNode
{
    int n;
    DNode prev;
    DNode next;
    DNode()//default constructor
    {
        n=0;
        prev=null;
        next=null;
    }
    public DNode GetNode(int e)//to create nodes
    {
        DNode N=new DNode();
        N.n=e;
        return N;
    }
}