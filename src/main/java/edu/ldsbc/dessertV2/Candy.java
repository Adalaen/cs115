package edu.ldsbc.dessertV2;

public class Candy extends DessertItem {
    private double weight;
    private double pricePerPound;

    public Candy(String name, double weight, double pricePerPound){
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int calculateItemCost(){
        return ((int) Math.round(weight * pricePerPound));
    }

    @Override
    public int calculateSalesTax() {
        return (int)Math.round(this.calculateItemCost()*0.1);
    }

    @Override
    public String toReceipt() {
        return super.toReceipt() +
                ", weight = " + weight + " lbs" +
                ", pricePerPound = " + pricePerPound +
                ", Sales Tax = " + calculateSalesTax();
    }

    @Override
    public String toString() {
        return "Candy{" +
                "weight=" + weight +
                ", pricePerPound=" + pricePerPound +
                "} " + super.toString();
    }
}
