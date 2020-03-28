package demo1;

public class BinTree {
    /**头节点**/
    private TreeNode node;

    public BinTree(TreeNode node) {
        this.node = node;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public BinTree(char[] arg, char value) {
        node = createBinTree(null,arg,value,new Index());
    }

    /**创建二叉树**/
    public TreeNode createBinTree(TreeNode treeNodes, char[] arg, char value, Index index){
        if(index.get() < arg.length && arg[index.get()] != value){
            treeNodes = new TreeNode(arg[index.get()]);
            treeNodes.setLeft(createBinTree(treeNodes.getLeft(),arg,value,index.add()));
            treeNodes.setRight(createBinTree(treeNodes.getRight(),arg,value,index.add()));
        }
        return treeNodes;
    }

    /***
     * 递归前序遍历二叉树
     */
    public void preOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        System.out.print(treeNode.getValue());
        preOrder(treeNode.getLeft());
        preOrder(treeNode.getRight());
    }

    /***
     * 递归二叉树中序遍历
     * @param treeNode
     */
    public void midPrder(TreeNode treeNode){
        if(treeNode== null){
            return;
        }
        midPrder(treeNode.getLeft());
        System.out.print(treeNode.getValue());
        midPrder(treeNode.getRight());
    }

    /****
     * 递归二叉树后序遍历
     * @param treeNode
     */
    public void postOrder(TreeNode treeNode){
        if(treeNode== null){
            return;
        }
        postOrder(treeNode.getLeft());
        postOrder(treeNode.getRight());
        System.out.print(treeNode.getValue());
    }

}
