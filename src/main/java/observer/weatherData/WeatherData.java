package observer.weatherData;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList obs;
    private String temperature;
    private String humidity;

    public WeatherData() {
        obs=new ArrayList();
    }

    @Override
    public void addObserver(Observer o) {
        obs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(obs.lastIndexOf(o)>=0){
            obs.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<obs.size();i++){
            Observer o = (Observer) obs.get(i);
            o.update(temperature,humidity);
        }
    }
    public void changeElements(String t,String h){
        this.humidity=h;
        this.temperature=t;
        notifyObserver();//变化后通知观察者
    }
}
