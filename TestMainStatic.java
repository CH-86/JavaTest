/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-09-15 22:39
 */
public class TestMainStatic {
    static class fruit{
        String name;
        int price;

        fruit(String a, int b){
            this.name = a;
            this.price = b;
        }
    }

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Integer i = 0;
        Double d = 0.0;

        System.out.println(i.equals(d));

        String name;
        int price;
        var a = new fruit("apple", 12);
        var b = new fruit("apple", 12);

        var c = a;

        System.out.println(a.equals(b)); // false
        System.out.println(a == b); // false


        System.out.println(a.equals(c)); // true
        System.out.println(a == c); // true

    }
}
