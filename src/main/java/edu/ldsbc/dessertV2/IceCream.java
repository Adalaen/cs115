package edu.ldsbc.dessertV2;

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
    public int calculateSalesTax() {
        return (int)Math.round(this.calculateItemCost()*0.1);
    }

    @Override
    public String toReceipt() {
        return super.toReceipt() +
                ", cost = " + cost +
                ", Sales Tax = " + calculateSalesTax();
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "cost=" + cost +
                "} " + super.toString();
    }
}
