// Utilizes the open/close principle
interface DiscountStrategy {
    double calculate();
}

class RegularDiscount implements DiscountStrategy {
    public double calculate() {
        return 10;
    }
}

class VIPDiscount implements DiscountStrategy {
    public double calculate() {
        return 20;
    }
}
