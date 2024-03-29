package Interator.waitress;

import java.util.ArrayList;
import java.util.Iterator;
//遍历PancakeMenu的遍历器
public class PancakeIterator implements Iterator {
    ArrayList<Item> items;
    int position=0;

    public PancakeIterator(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position<items.size()&&items.get(position)!=null)
            return true;
        else return false;
    }

    @Override
    public Object next() {
        Item item=items.get(position);
        position++;
        return item;
    }
}
