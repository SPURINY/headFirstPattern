package singleton;

public class demo {
    public static void main(String[] args) {
        HungerSingleton instance1 = HungerSingleton.getInstance();
        HungerSingleton instance2 = HungerSingleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println("------------");
        LazySingleton instance3 = LazySingleton.getInstance();
        LazySingleton instance4 = LazySingleton.getInstance();
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
        /*
        *   460141958
            460141958
            ------------
            1163157884
            1163157884
        * */
    }
}
