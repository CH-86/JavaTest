package ArrayList;

import java.util.ArrayList;

/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-10-17 09:45
 */
public class init {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.size());
        System.out.println(sites.contains("Taobao"));
        System.out.println(sites.indexOf("Taobao"));

        //System.out.println(sites.equals(new ArrayList({"Google", "Runoob", "Taobao", "Weibo"})));

    }
}
