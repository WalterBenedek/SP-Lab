package test1902;

public class Salata implements Produs {
    private String dressing;


    public void accept(Visitor visitor) {
        visitor.calculatePriceSalata(this);}
}
