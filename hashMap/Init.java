package hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-10-17 01:49
 */
public class Init {
    public static void main(String[] args) {
        Map<String, Object> hashMap = new HashMap();

        hashMap.put("apple", 5);
        hashMap.put("apple", 10);

        hashMap.put("banana1", null);
        hashMap.put("banana2", null);
        hashMap.put(null, 0);

        hashMap.put(null, 404);

        System.out.println(hashMap);

        for (String key: hashMap.keySet()){
            System.out.println(key + " " + hashMap.get(key));
        }

    }
}
