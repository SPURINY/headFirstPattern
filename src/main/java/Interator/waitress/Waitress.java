package Interator.waitress;

import java.util.Iterator;

public class Waitress {
    PancakeHouseMenu pm;
    DinnerHouseMenu dm;

    public Waitress(PancakeHouseMenu pm, DinnerHouseMenu dm) {
        this.pm = pm;
        this.dm = dm;
    }
    public void printMenu(){
        Iterator pancakeI = pm.createIterator();
        Iterator dinnerI = dm.createIterator();
        printMenuUtil(pancakeI);
        printMenuUtil(dinnerI);

    }
    public void printMenuUtil(Iterator iterator){
        while(iterator.hasNext()){
            Item i= (Item) iterator.next();//因为返回值类型我设的Iterator
            System.out.println(i.getName()+"-"+i.getPrice()+"-"+i.getDescription());
        }

    }
}
