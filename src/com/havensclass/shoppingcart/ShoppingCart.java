package com.havensclass.shoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    private String customerName;
    private String currentDate;

    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

    public String getCustomerName() {
        return this.customerName;
    }

    public String getDate() {
        return this.currentDate;
    }

    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    public void removeItem(String itemName) {
        if (cartItems.contains(itemName)) {
            cartItems.remove(itemName);
        } else {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(String itemName) {
        if (cartItems.contains(itemName)) {
            cartItems.remove(itemName);
        } else {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart() {
        return cartItems.size();
    }

    public int getCostOfCart() {
        int total = 0;
        for (ItemToPurchase cartItem:cartItems) {
            total = total + cartItem.getPrice();
        }

        return total;
    }

    public void printTotal() {
        if (cartItems.size() > 0) {
            System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
            System.out.println("Number of Items: " + getNumItemsInCart());
            for (ItemToPurchase cartItem:cartItems) {
                cartItem.printItemCost();
            }
            System.out.println("");
            System.out.println("Total: " + getCostOfCart());
        } else {
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }

    public void printDescriptions() {
        System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println("");
        System.out.println("Item Descriptions");
        for (ItemToPurchase cartItem: cartItems) {
            System.out.print(cartItem.getName() + ": ");
            cartItem.printItemDescripiton();
        }
    }
}
