public class PaymentService {
    public String processPayment(PaymentMethod method, double amount) {
        return method.pay(amount);
    }
}
