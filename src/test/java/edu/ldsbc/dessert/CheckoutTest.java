package edu.ldsbc.dessert;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutTest {

    @Test
    public void addDessert() throws Exception {
        Checkout checkout = new Checkout();

        checkout.add(new IceCream("Strawberry Ice Cream",145));
        checkout.add(new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
        checkout.add (new Candy("Gummy Worms", 1.33, 89));
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.add (new Candy("Salt Water Taffy", 1.5, 209));
        checkout.add (new Candy("Candy Corn",3.0, 109));
        assertEquals(327, checkout.itemCost(5));
        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nReceipt: " + checkout.receiptItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println(checkout);
    }

    @Test
    public void candyCalculate() throws Exception {
        Candy candy = new Candy("Gummy Worms", 1.33, 89);
        assertEquals(118, candy.calculateItemCost());

        candy = new Candy("Candy Corn",3.0, 109);
        assertEquals(327, candy.calculateItemCost());

        candy = new Candy("Candy Corn",10, 1);
        assertEquals(10, candy.calculateItemCost());

        candy = new Candy("Candy Corn",20, 1);
        assertEquals(20, candy.calculateItemCost());

        candy = new Candy("Candy Corn",10, 2);
        assertEquals(20, candy.calculateItemCost());

        candy = new Candy("Candy Corn",3.0, 109);
        assertEquals(327, candy.calculateItemCost());

        candy = new Candy("Salt Water Taffy", 1.5, 209);
        assertEquals(314, candy.calculateItemCost());

        candy = new Candy("Gummy Worms", 1.33, 89);
        assertEquals(118, candy.calculateItemCost());
    }

    @Test
    public void cookieCalculate() throws Exception {
        Cookie cookie = new Cookie("Chocolate Chip Cookies", 12, 100);
        assertEquals(100, cookie.calculateItemCost());

        cookie = new Cookie("Chocolate Chip Cookies", 6, 100);
        assertEquals(50, cookie.calculateItemCost());

        cookie = new Cookie("Chocolate Chip Cookies", 12, 50);
        assertEquals(50, cookie.calculateItemCost());

        cookie = new Cookie("Chocolate Chip Cookies", 6, 50);
        assertEquals(25, cookie.calculateItemCost());

        cookie = new Cookie("Chocolate Chip Cookies", 4, 399);
        assertEquals(133, cookie.calculateItemCost());
    }

    @Test
    public void iceCreamCalculate() throws Exception {
        IceCream iceCream = new IceCream("Strawberry Ice Cream",145);
        assertEquals(145, iceCream.calculateItemCost());

        iceCream = new IceCream("Strawberry Ice Cream",50);
        assertEquals(50, iceCream.calculateItemCost());

        iceCream = new IceCream("Strawberry Ice Cream",200);
        assertEquals(200, iceCream.calculateItemCost());
    }

    @Test
    public void sundaeCalculate() throws Exception {
        Sundae sundae = new Sundae("Vanilla Ice Cream",100, "Caramel", 50);
        assertEquals(150, sundae.calculateItemCost());

        sundae = new Sundae("Vanilla Ice Cream",50, "Caramel", 50);
        assertEquals(100, sundae.calculateItemCost());

        sundae = new Sundae("Vanilla Ice Cream",100, "Caramel", 100);
        assertEquals(200, sundae.calculateItemCost());

        sundae = new Sundae("Vanilla Ice Cream",10, "Caramel", 10);
        assertEquals(20, sundae.calculateItemCost());

        sundae = new Sundae("Vanilla Ice Cream",105, "Caramel", 50);
        assertEquals(155, sundae.calculateItemCost());
    }
}