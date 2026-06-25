public class WebApp implements Observer {

    private String browserUser;

    public WebApp(String browserUser) {
        this.browserUser = browserUser;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Web Dashboard Update for " + browserUser +
                " -> " + stockName + " is now Rs." + price);
    }
}