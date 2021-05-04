class CNode
{
    int n;
    CNode next;
    CNode()//default constructor
    {
        n=0;
        next=null;
    }
    public CNode GetNode(int e)//creates nodes
    {
        CNode N=new CNode();
        N.n=e;
        N.next=N;
        return N;
    }
}
