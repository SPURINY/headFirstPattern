package Interator.waitress;

import java.util.Iterator;
//遍历DinnerMenu的遍历器

public class DinnerIterator implements Iterator {
    Item []items;
    int position=0;

    public DinnerIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(items[position]!=null&&items.length>position)
            return true;
        else  return false;
    }

    @Override
    public Object next() {
        Item i=items[position++];
        return i;
    }
}
