package test1902;

public class CalculatePriceVisitor {
    private int pizzaPrices;
    private int salataPrices;

    public void calculatePricePizza(Pizza pizza) {
        pizzaPrices += pizza.getPrice();
    }

    public void calculatePriceSalata(Salata salata) {
        salataPrices += salata.getPrice();
    }



    public void printPrices() {
        System.out.println("Pret total pizza: " + this.pizzaPrices);
        System.out.println("Pret total salata: " + this.salataPrices);
    }
}
