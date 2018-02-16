package edu.ldsbc.dessert;

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
    public String toReceipt() {
        return super.toReceipt() +
                ", weight = " + weight + " lbs" +
                ", pricePerPound = " + pricePerPound;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "weight=" + weight +
                ", pricePerPound=" + pricePerPound +
                "} " + super.toString();
    }
}
