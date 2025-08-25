public class StandardTaxCalculator implements TaxCalculator {
    private final double taxRate = 0.18;
    public double calculate(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
