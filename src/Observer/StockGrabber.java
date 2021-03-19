package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {

        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {

        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {

        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + (observerIndex + 1) + " deleted.");

        observers.remove(o);
    }

    @Override
    public void notifyObserver() {

        for (Observer o : observers)
            o.update(ibmPrice, aaplPrice, googPrice);
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
