import demo1.BinTree;
import org.junit.Test;

public class demon1 {

    @Test
    public void test() {
        char[] arg = {'A', 'B', 'D','#','#' ,'E','#','#','C', 'F','#', '#','G'};
        BinTree binTree = new BinTree(arg, '#');
        System.out.println("前序递归遍历");
        binTree.preOrder(binTree.getNode());
        System.out.println();
        System.out.println("中序递归遍历");
        binTree.midPrder(binTree.getNode());
        System.out.println();
        System.out.println("后序递归遍历:");
        binTree.postOrder(binTree.getNode());
    }
}
