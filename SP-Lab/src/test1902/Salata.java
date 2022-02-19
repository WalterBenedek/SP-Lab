package test1902;

public class Salata implements Produs {
    private String dressing;


    public double accept(Visitor visitor) {
        visitor.calculatePriceSalata(this);
        return 0;
    }
}
