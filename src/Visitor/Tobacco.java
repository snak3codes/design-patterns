package Visitor;

public class Tobacco implements Visitable {
    private final double price;

    public Tobacco(double item) {
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
