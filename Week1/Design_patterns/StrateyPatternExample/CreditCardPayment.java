public class CreditCardPayment implements PaymentStrategy {

    private String cardHolderName;
    private String cardNumber;

    public CreditCardPayment(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount +
                " using Credit Card belonging to " + cardHolderName +
                " [Card Ending: " + cardNumber.substring(cardNumber.length() - 4) + "]");
    }
}