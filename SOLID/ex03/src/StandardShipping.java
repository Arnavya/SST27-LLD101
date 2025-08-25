class StandardShipping implements ShippingPolicy {
    public double cost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}

class ExpressShipping implements ShippingPolicy {
    public double cost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}

class OvernightShipping implements ShippingPolicy {
    public double cost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}