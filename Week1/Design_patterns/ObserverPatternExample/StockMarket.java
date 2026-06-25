import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getClass().getSimpleName() + " subscribed to stock updates.");
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " unsubscribed from stock updates.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void setStock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        System.out.println("\nStock Update: " + stockName + " price changed to Rs." + price);
        notifyObservers();
    }
}