public class InMemoryOrderRepository implements OrderRepository {
    public void save(String orderDetails) {
        System.out.println("Order stored: " + orderDetails);
    }
}
