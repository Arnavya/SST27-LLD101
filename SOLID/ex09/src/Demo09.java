public class Demo09 {
    public static void main(String[] args) {
        OrderController sqlController = new OrderController(new SqlOrderRepository());
        sqlController.create("ORD-1");

        OrderController memController = new OrderController(new InMemoryOrderRepository());
        memController.create("ORD-2");
    }
}
