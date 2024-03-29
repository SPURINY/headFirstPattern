package observer.weatherData;

public class Observer2 implements Observer{
    private Subject weatherData;
    private String temperature;
    private String humidity;

    public Observer2(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.addObserver(this);
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
