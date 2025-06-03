
public class Discount {
    public double calculate(String type) {
        if (type.equals("regular")) return 10;
        if (type.equals("vip")) return 20;
        return 0;
    }
}