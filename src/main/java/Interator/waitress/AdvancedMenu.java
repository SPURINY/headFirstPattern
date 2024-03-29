package Interator.waitress;

import java.util.ArrayList;
import java.util.Iterator;
/*
* 这个类为了演示使用ArrayList自带的遍历器，，也就是说不用为他写遍历器类了
* */
public class AdvancedMenu {
    private ArrayList<Item> items;

    public AdvancedMenu() {
        items=new ArrayList<>();
        items.add(new Item("ad1","15","ad1"));
        items.add(new Item("ad2","9.9","ad2"));
    }
    public Iterator createIterator(){
        return items.iterator();
    }
}
