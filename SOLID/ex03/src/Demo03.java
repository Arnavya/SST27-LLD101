public class Demo03 {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(new ExpressShipping(), 2.0);
        Shipment s2 = new Shipment(new StandardShipping(), 3.0);
        Shipment s3 = new Shipment(new OvernightShipping(), 1.5);

        System.out.println("Express:   " + s1.calculateCost());
        System.out.println("Standard:  " + s2.calculateCost());
        System.out.println("Overnight: " + s3.calculateCost());
    }
}