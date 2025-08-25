public class OrderService {
    private final Notifier notifier;
    private final OrderRepository repository;
    private final TaxCalculator taxCalculator;

    public OrderService(Notifier notifier, OrderRepository repository, TaxCalculator taxCalculator) {
        this.notifier = notifier;
        this.repository = repository;
        this.taxCalculator = taxCalculator;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculate(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        repository.save("Customer=" + customerEmail + ", Total=" + total);
    }
}