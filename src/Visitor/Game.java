package Visitor;

public class Game implements Visitable {
    private final double price;
    private final String name;

    public Game(String name, double item) {
        this.price = item;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
