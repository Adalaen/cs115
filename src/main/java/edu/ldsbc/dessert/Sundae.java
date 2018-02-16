package edu.ldsbc.dessert;

public class Sundae extends IceCream {
    private String topping;
    private double toppingCost;

    public Sundae(String name, double cost, String topping, double toppingCost){
        super(name, cost);
        this.topping = topping;
        this.toppingCost = toppingCost;
    }

    @Override
    public int calculateItemCost(){
        return (int) (super.calculateItemCost() + toppingCost);
    }

    @Override
    public String toReceipt() {
        return super.toReceipt() +
                ", topping = " + topping +
                ", toppingCost = " + toppingCost;
    }

    @Override
    public String toString() {
        return "Sundae{" +
                "topping='" + topping + '\'' +
                ", toppingCost=" + toppingCost +
                "} " + super.toString();
    }
}
