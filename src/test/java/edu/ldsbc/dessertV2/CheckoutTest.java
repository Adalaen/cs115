package edu.ldsbc.dessertV2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutTest {
    
    @Test
    public void addDessert() throws Exception {
        edu.ldsbc.dessertV2.Checkout checkout = new Checkout();

        checkout.add(new edu.ldsbc.dessertV2.IceCream("Strawberry Ice Cream",145));
        checkout.add(new edu.ldsbc.dessertV2.Sundae("Vanilla Ice Cream",105, "Caramel", 50));
        checkout.add (new edu.ldsbc.dessertV2.Candy("Gummy Worms", 1.33, 89));
        checkout.add (new edu.ldsbc.dessertV2.Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.add (new edu.ldsbc.dessertV2.Candy("Salt Water Taffy", 1.5, 209));
        checkout.add (new edu.ldsbc.dessertV2.Candy("Candy Corn",3.0, 109));
        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nReceipt: " + checkout.receiptItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost());
        System.out.println("Total Sales cost: " + checkout.totalSalesTax() + "\n");
        System.out.println(checkout);
    }

    @Test
    public void candyCalculate() throws Exception {
        edu.ldsbc.dessertV2.Candy candy = new edu.ldsbc.dessertV2.Candy("Gummy Worms", 1.33, 89);
        assertEquals(118, candy.calculateItemCost());
        assertEquals(12, candy.calculateSalesTax());

        candy = new edu.ldsbc.dessertV2.Candy("Candy Corn",3.0, 109);
        assertEquals(327, candy.calculateItemCost());
        assertEquals(33, candy.calculateSalesTax());

        candy = new edu.ldsbc.dessertV2.Candy("Candy Corn",10, 1);
        assertEquals(10, candy.calculateItemCost());
        assertEquals(1, candy.calculateSalesTax());

        candy = new edu.ldsbc.dessertV2.Candy("Candy Corn",20, 1);
        assertEquals(20, candy.calculateItemCost());
        assertEquals(2, candy.calculateSalesTax());

        candy = new edu.ldsbc.dessertV2.Candy("Candy Corn",10, 2);
        assertEquals(20, candy.calculateItemCost());
        assertEquals(2, candy.calculateSalesTax());

        candy = new edu.ldsbc.dessertV2.Candy("Candy Corn",3.0, 109);
        assertEquals(327, candy.calculateItemCost());
        assertEquals(33, candy.calculateSalesTax());

        candy = new edu.ldsbc.dessertV2.Candy("Salt Water Taffy", 1.5, 209);
        assertEquals(314, candy.calculateItemCost());
        assertEquals(31, candy.calculateSalesTax());

        candy = new Candy("Gummy Worms", 1.33, 89);
        assertEquals(118, candy.calculateItemCost());
        assertEquals(12, candy.calculateSalesTax());
    }

    @Test
    public void cookieCalculate() throws Exception {
        edu.ldsbc.dessertV2.Cookie cookie = new edu.ldsbc.dessertV2.Cookie("Chocolate Chip Cookies", 12, 100);
        assertEquals(100, cookie.calculateItemCost());
        assertEquals(10, cookie.calculateSalesTax());

        cookie = new edu.ldsbc.dessertV2.Cookie("Chocolate Chip Cookies", 6, 100);
        assertEquals(50, cookie.calculateItemCost());
        assertEquals(5, cookie.calculateSalesTax());

        cookie = new edu.ldsbc.dessertV2.Cookie("Chocolate Chip Cookies", 12, 50);
        assertEquals(50, cookie.calculateItemCost());
        assertEquals(5, cookie.calculateSalesTax());

        cookie = new edu.ldsbc.dessertV2.Cookie("Chocolate Chip Cookies", 6, 50);
        assertEquals(25, cookie.calculateItemCost());
        assertEquals(3, cookie.calculateSalesTax());

        cookie = new Cookie("Chocolate Chip Cookies", 4, 399);
        assertEquals(133, cookie.calculateItemCost());
        assertEquals(13, cookie.calculateSalesTax());
    }

    @Test
    public void iceCreamCalculate() throws Exception {
        edu.ldsbc.dessertV2.IceCream iceCream = new edu.ldsbc.dessertV2.IceCream("Strawberry Ice Cream",145);
        assertEquals(145, iceCream.calculateItemCost());
        assertEquals(15, iceCream.calculateSalesTax());

        iceCream = new edu.ldsbc.dessertV2.IceCream("Strawberry Ice Cream",50);
        assertEquals(50, iceCream.calculateItemCost());
        assertEquals(5, iceCream.calculateSalesTax());

        iceCream = new IceCream("Strawberry Ice Cream",200);
        assertEquals(200, iceCream.calculateItemCost());
        assertEquals(20, iceCream.calculateSalesTax());
    }

    @Test
    public void sundaeCalculate() throws Exception {
        edu.ldsbc.dessertV2.Sundae sundae = new edu.ldsbc.dessertV2.Sundae("Vanilla Ice Cream",100, "Caramel", 50);
        assertEquals(150, sundae.calculateItemCost());
        assertEquals(15, sundae.calculateSalesTax());

        sundae = new edu.ldsbc.dessertV2.Sundae("Vanilla Ice Cream",50, "Caramel", 50);
        assertEquals(100, sundae.calculateItemCost());
        assertEquals(10, sundae.calculateSalesTax());

        sundae = new edu.ldsbc.dessertV2.Sundae("Vanilla Ice Cream",100, "Caramel", 100);
        assertEquals(200, sundae.calculateItemCost());
        assertEquals(20, sundae.calculateSalesTax());

        sundae = new edu.ldsbc.dessertV2.Sundae("Vanilla Ice Cream",10, "Caramel", 10);
        assertEquals(20, sundae.calculateItemCost());
        assertEquals(2, sundae.calculateSalesTax());

        sundae = new Sundae("Vanilla Ice Cream",105, "Caramel", 50);
        assertEquals(155, sundae.calculateItemCost());
        assertEquals(16, sundae.calculateSalesTax());
    }
}