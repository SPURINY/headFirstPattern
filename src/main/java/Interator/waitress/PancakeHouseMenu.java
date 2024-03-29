package Interator.waitress;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    private ArrayList<Item>items;

    public PancakeHouseMenu() {
        items=new ArrayList<>();
        items.add(new Item("sweetPancke","15","sweet^^pancake__"));
        items.add(new Item("SourPie","9.9","sour--pie~"));
    }
    public Iterator createIterator(){
        return new PancakeIterator(items);
    }
}
