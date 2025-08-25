

public class Demo01 {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        OrderRepository repository = new InMemoryOrderRepository();
        TaxCalculator taxCalculator = new StandardTaxCalculator();

        OrderService service = new OrderService(notifier, repository, taxCalculator);
        service.checkout("a@shop.com", 100.0);
    }
}
