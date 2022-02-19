package test1902;

interface Produs {
    String Nume = null;
    double pret = 0;
    int timpdepregatire = 0;


    public default void add(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Box " + this.boxName);
        if (elements != null) {
            for (Element i: elements)
                i.print();
        }
    }
    public default void accept(Visitor visitor) {
        if (elements != null) {
            for (Element i: elements)
                i.accept(visitor);
        }

    public default double getPrice() {
        return pret;
    }
}
