public class Demo04 {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        System.out.println(service.processPayment(new CardPayment(), 1200));
        System.out.println(service.processPayment(new UpiPayment(), 499));
        System.out.println(service.processPayment(new WalletPayment(), 300));
    }
}
