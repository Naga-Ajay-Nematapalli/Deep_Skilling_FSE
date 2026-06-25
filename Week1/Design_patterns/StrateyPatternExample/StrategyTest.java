public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext(new CreditCardPayment("Ajay", "1234567812345678"));

        paymentContext.makePayment(2500);

        paymentContext.setPaymentStrategy(
                new PayPalPayment("ajay.paypal@gmail.com"));

        paymentContext.makePayment(4200);
    }
}