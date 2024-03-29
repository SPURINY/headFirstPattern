package Interator.waitress;

import java.util.Iterator;

public class DinnerHouseMenu {
    private Item[]items;
    static final int MAX_ITEM=8;
    private int numberOfItem=0;//作用和position一样，记录下标

    public DinnerHouseMenu() {
        items=new Item[MAX_ITEM];
        addItem("pizza","29","奥尔良披萨");
        addItem("noddles","21","乌冬面");
    }
    public Iterator createIterator(){
        return new DinnerIterator(items);
    }
    public void addItem(String name, String price, String description){
        if(numberOfItem<=MAX_ITEM){
            items[numberOfItem++]=new Item(name,price,description);
        }else System.out.println("数组装满");

    }
}
