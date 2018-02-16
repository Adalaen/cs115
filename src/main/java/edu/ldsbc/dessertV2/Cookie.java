package edu.ldsbc.dessertV2;

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
    public int calculateSalesTax() {
        return (int)Math.round(this.calculateItemCost()*0.1);
    }

    @Override
    public String toReceipt() {
        return super.toReceipt() +
                ", number = " + number +
                ", pricePerDozen = " + pricePerDozen +
                ", Sales Tax = " + calculateSalesTax();
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "number=" + number +
                ", pricePerDozen=" + pricePerDozen +
                "} " + super.toString();
    }
}
