import jdk.swing.interop.SwingInterOpUtils;

/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2023-01-09 15:19
 */

class MyNode{
    int x;
    int y;

    MyNode(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class TestEquals {
    public static void main(String[] args) {

        MyNode aN = new MyNode(1,2);

        MyNode bN = new MyNode(1,2);
        System.out.println(aN.equals(bN));

        MyNode cN = bN;
        System.out.println(cN.equals(bN));
        System.out.println(cN == bN);
    }
}
