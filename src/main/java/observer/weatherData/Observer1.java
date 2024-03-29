package observer.weatherData;

public class Observer1 implements Observer{
    private Subject weatherData;
    private String temperature;
    private String humidity;

    public Observer1(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.addObserver(this);//申请成为观察者
    }

    @Override
    public void update(String t,String h) {
        this.humidity=h;
        this.temperature=t;
        display();
    }
    public void display(){
        System.out.println(this.getClass()+",humidity:"+humidity+" temperature:"+temperature);
    }
}
