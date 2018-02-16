package edu.ldsbc.dessertV2;

public abstract class DessertItem {
    private String name;

    public DessertItem(String name) {
        this.name = name;
    }

    public int calculateItemCost(){
        return 0;
    }

    public String toReceipt() {
        return "Name = " + name;
    }

    public abstract int calculateSalesTax();

    @Override
    public String toString() {
        return "DessertItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
