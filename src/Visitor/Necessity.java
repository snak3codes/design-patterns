package Visitor;

public class Necessity implements Visitable {
    private final double price;

    public Necessity(double item) {
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
