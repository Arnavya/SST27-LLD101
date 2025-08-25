class OvernightShipping implements ShippingPolicy {
    public double cost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}