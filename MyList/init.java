package MyList;

import hashMap.Init;

import java.awt.*;

/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-10-17 17:20
 */

class MyList extends List {

    @Override
    public void add(String item) {
        super.add(item, super.getItemCount()/2);
    }
}

public class init {
    public static void main(String[] args) {
        MyList myList = new MyList();

        myList.add("apple");
        myList.add("banana");

        myList.add("orange");

        System.out.println(myList.getItem(1));

    }
}
