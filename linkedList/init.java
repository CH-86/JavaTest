package linkedList;

import java.util.LinkedList;

/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-10-17 09:41
 */
public class init {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        sites.addLast("Wiki");



        System.out.println(sites);
    }
}
