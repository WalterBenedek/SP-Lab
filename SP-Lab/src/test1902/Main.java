package test1902;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Element> elements = new ArrayList<Element>();

        Pizza casei = new Pizza();
        Pizza clasica = new Pizza();
        Salata greceasca = new Salata();



        pizza.add(casei);
        pizza.add(clasica);
        salata.add(greceasca);



        pizza.print();

        CalculatePriceVisitor visitor = new CalculatePriceVisitor();
        pizza.accept(visitor);

        visitor.printPrices();
    }
}