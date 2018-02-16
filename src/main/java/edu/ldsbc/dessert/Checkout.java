package edu.ldsbc.dessert;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<DessertItem> items = new ArrayList<DessertItem>();

    public void add(DessertItem item){
        items.add(item);
    }

    public String numberOfItems(){
        String itemNumbers = "" + items.size();
        for (int i = 0; i<items.size();i++){
            itemNumbers += "\n" + items.get(i).toString();
        }
        return itemNumbers;
    }

    public String receiptItems(){
        String itemInfo = "";
        for (int i = 0; i<items.size();i++){
            itemInfo += "\n" + items.get(i).toReceipt();
        }
        return itemInfo;
    }

    public int itemCost(int item){
        int cost = 0;
        cost += items.get(item).calculateItemCost();
        return cost;
    }

    public String totalCost(){
        int tCost = 0;
        for (int i = 0; i<items.size();i++){
            tCost += items.get(i).calculateItemCost();
        }
        String sTotalCost = "$"+tCost;
        sTotalCost = sTotalCost.substring(0, sTotalCost.length()-2) + "." +
                sTotalCost.substring(sTotalCost.length()-2);
        return sTotalCost;
    }
}
