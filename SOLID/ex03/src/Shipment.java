class Shipment {
    private final ShippingPolicy policy;
    private final double weightKg;

    Shipment(ShippingPolicy policy, double weightKg) {
        this.policy = policy;
        this.weightKg = weightKg;
    }

    public double calculateCost() {
        return policy.cost(weightKg);
    }
}