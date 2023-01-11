/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-09-13 22:45
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer i127 = 127,j127 = 127, i128 = 128, j128 = 128 ,iNew127 = new Integer(127) ;

        int i = 128;

//        Integer c;
//        int b;
//        System.out.println(b);
//        System.out.println(c); need initialize

        System.out.println(i127 == j127);
        System.out.println(i128 == j128);
        System.out.println(iNew127 == i127);
//true
//false
//false
//常量池
        System.out.println(i127.equals(j127));
        System.out.println(i128.equals(j128));
        System.out.println(i127.equals(iNew127));
//true
//true
//true
//Integer的equals被重写 比较值
        System.out.println(i128.equals(i));
//true
        // https://blog.csdn.net/xiangjunyes/article/details/110679900
        // https://blog.csdn.net/m0_47743353/article/details/122810501

        Integer i_128 = -128, j_128 = -128, i_129 = -129, j_129 = -129;
        System.out.println(i_128 == j_128);
        System.out.println();
    }
}
