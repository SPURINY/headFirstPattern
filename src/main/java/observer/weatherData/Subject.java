package observer.weatherData;

/*
* 被观察者（Subject）接口
* */
public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
