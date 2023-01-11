package hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-10-17 09:08
 */
public class init {
    public static void main(String[] args) {
        Set<Object> hashSet = new HashSet();

        hashSet.add(null);

        hashSet.add(null);

        hashSet.add(123);

        hashSet.add(1);

        hashSet.forEach(System.out::println);

        hashSet.addAll(hashSet);

        System.out.println(hashSet);
    }
}
