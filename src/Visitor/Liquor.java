package Visitor;

public class Liquor implements Visitable {

    private final double price;

    public Liquor(double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
