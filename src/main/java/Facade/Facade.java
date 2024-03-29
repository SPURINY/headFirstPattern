package Facade;

public class Facade {
    subSystemA a;
    subSystemB b;
    subSystemC c;

    public Facade() {
        a=new subSystemA();
        b=new subSystemB();
        c=new subSystemC();
    }

    public Facade(subSystemA a, subSystemB b, subSystemC c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void allOn(){//把三个方法封装成一个简单的接口（简化
        a.lightsOn();
        b.moviesOn();
        c.CDsOn();
    }
    public void allOff(){
        a.lightsOff();
        b.moviesOff();
        c.CDsOff();
    }
    public void CD(){//但用户仍可以进行底层单独的调用
        c.CDsOn();
    }

}
