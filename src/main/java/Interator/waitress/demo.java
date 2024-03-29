package Interator.waitress;
//迭代器模式将能让客户遍历你的对象而又无法窥视你存储对象的方式。
public class demo {
    public static void main(String[] args) {
        Waitress w=new Waitress(new PancakeHouseMenu(),new DinnerHouseMenu());
        w.printMenu();
    }
}
