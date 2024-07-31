public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "Mayank Kush", "123", "12/23");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.pay(250.0);

        System.out.println("");

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("MayankKush@gmail.com", "password123");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.pay(150.0);
    }
}
