package edu.ldsbc.dessert;

public class IceCream extends DessertItem {
    private double cost;

    public IceCream(String name, double cost){
        super(name);
        this.cost = cost;
    }

    @Override
    public int calculateItemCost(){
        return (int) (cost);
    }

    @Override
    public String toReceipt() {
        return super.toReceipt() +
                ", cost = " + cost;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "cost=" + cost +
                "} " + super.toString();
    }
}
