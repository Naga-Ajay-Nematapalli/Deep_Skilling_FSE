public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser1 = new MobileApp("Ajay");
        Observer mobileUser2 = new MobileApp("Ravi");
        Observer webUser1 = new WebApp("AdminDashboard");

        stockMarket.registerObserver(mobileUser1);
        stockMarket.registerObserver(mobileUser2);
        stockMarket.registerObserver(webUser1);

        stockMarket.setStock("TCS", 3680.50);
        stockMarket.setStock("Infosys", 1492.75);

        stockMarket.deregisterObserver(mobileUser2);

        stockMarket.setStock("Wipro", 520.30);
    }
}