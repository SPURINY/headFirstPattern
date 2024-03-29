package singleton;
public class LazySingleton {
    /*
    * 懒汉式+双重检查锁
    * */
    private volatile static LazySingleton instance;
    private LazySingleton(){}//构造器私有
    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                if(instance==null){
                    instance=new LazySingleton();
                }
            }
        }
        return instance;
    }
}
