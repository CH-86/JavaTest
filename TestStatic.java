/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-09-12 16:03
 */
public class TestStatic {
    public static void main(String[] args)
    {
        A a = new A();
        a.add();
        System.out.println(a.re());


        A b = new A();
        b.add();
        System.out.println(A.i);
        System.out.println(A.re());
        System.out.println(b.re());
    }
}


class A
{
    public static int i  = 1;

    public void add()
    {
        i++;
    }

    static int re()
    {
        return i;
    }
}
