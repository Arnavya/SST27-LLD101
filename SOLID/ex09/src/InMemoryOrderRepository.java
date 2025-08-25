import java.util.ArrayList;
import java.util.List;

public class InMemoryOrderRepository implements OrderRepository {
    private final List<String> orders = new ArrayList<>();

    @Override
    public void save(String id) {
        orders.add(id);
        System.out.println("Saved order " + id + " in memory");
    }
}
