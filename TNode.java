class TNode
{
    int n;
    TNode LTree;
    TNode RTree;
    TNode()//default construtor
    {
        n=0;
        LTree=null;
        RTree=null;
    }
    TNode GetNode(int i)//creates nodes
    {
        TNode N=new TNode();
        N.n=i;
        return N;
    }
}