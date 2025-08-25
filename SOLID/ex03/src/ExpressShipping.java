class ExpressShipping implements ShippingPolicy {
    public double cost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}