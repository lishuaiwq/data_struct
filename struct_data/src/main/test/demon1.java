import demo1.BinTree;
import demo1.TreeNode;
import org.junit.Test;

public class demon1 {

    @Test
    public void test() {
        char[] arg = {'a', 'b', '#', '#', 'c', '#', '#'};
        BinTree binTree = new BinTree(arg, '#');
        System.out.println(binTree);
    }
}
