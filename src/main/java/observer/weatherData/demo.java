package observer.weatherData;

public class demo {
    public static void main(String[] args) {
        WeatherData wd=new WeatherData();
        Observer1 observer1 = new Observer1(wd);//成为wd的观察者
        wd.changeElements("23456","987");
        System.out.println("----------------");
        Observer2 observer2 = new Observer2(wd);
        wd.changeElements("100","9");
    }
}
