package test1902;

public class Pizza implements Produs {
    private final int timp_preparare;
    private String marime;

    public Pizza() {
        this.timp_preparare = 5;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
