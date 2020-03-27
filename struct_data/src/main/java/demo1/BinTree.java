package demo1;

public class BinTree {
    /**头节点**/
    private TreeNode node;

    public BinTree(TreeNode node) {
        this.node = node;
    }

    public BinTree(char[] arg, char value) {
        node = createBinTree(null,arg,value,new Index());
    }

    /**创建二叉树**/
    public TreeNode createBinTree(TreeNode treeNodes, char[] arg, char value, Index index){
        if(arg[index.get()] != value && index.get() < arg.length){
            treeNodes = new TreeNode(arg[index.get()]);
            treeNodes.setLeft(createBinTree(treeNodes.getLeft(),arg,value,index.add()));
            treeNodes.setRight(createBinTree(treeNodes.getRight(),arg,value,index.add()));
        }
        return treeNodes;
    }

}
