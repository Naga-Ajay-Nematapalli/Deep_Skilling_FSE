public class AdapterTest {
    public static void main(String[] args){
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());

        paypal.processPayment(15000);
        stripe.processPayment(26000);
    }
}
