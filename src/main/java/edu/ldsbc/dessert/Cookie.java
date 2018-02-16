package edu.ldsbc.dessert;

public class Cookie extends DessertItem {
    private int number;
    private double pricePerDozen;

    public Cookie(String name, int number, double pricePerDozen){
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int calculateItemCost(){
        return ((int) Math.round(pricePerDozen*((double) number/12)));
    }

    @Override
    public String toReceipt() {
        return super.toReceipt() +
                ", number = " + number +
                ", pricePerDozen = " + pricePerDozen;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "number=" + number +
                ", pricePerDozen=" + pricePerDozen +
                "} " + super.toString();
    }
}
