package com.havensclass.shoppingcartinheritance;

import java.util.ArrayList;

class ShoppingCart {
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
        ItemToPurchase itemToDelete = null;
        for (ItemToPurchase item:cartItems) {
            if (item.getName().equals(itemName)) {
                itemToDelete = item;
            }
        }
        if (itemToDelete != null) {
            cartItems.remove(itemToDelete);
        } else {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(ItemToPurchase newItem) {
        boolean found = false;
        for (ItemToPurchase item:cartItems) {
            if(newItem.getName().equals(item.getName())) {
                found = true;

                if (newItem.getDescription() != "none") {
                    item.setDescription(newItem.getDescription());
                }

                if (newItem.getPrice() != 0) {
                    item.setPrice(newItem.getPrice());
                }

                if (newItem.getQuantity() != 0) {
                    item.setQuantity(newItem.getQuantity());
                }

            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart() {
        int total = 0;

        for (ItemToPurchase item:cartItems) {
            total = total + item.getQuantity();
        }

        return total;
    }

    public int getCostOfCart() {
        int total = 0;
        for (ItemToPurchase cartItem:cartItems) {
            total = total + (cartItem.getPrice() * cartItem.getQuantity());
        }

        return total;
    }

    public void printTotal() {
        System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
        System.out.println("Number of Items: " + getNumItemsInCart());
        if (cartItems.size() > 0) {
            for (ItemToPurchase cartItem:cartItems) {
                cartItem.printItemCost();
            }
            System.out.println("");
        } else {
            System.out.println();
            System.out.println("SHOPPING CART IS EMPTY");
            System.out.println();
        }
        System.out.println("Total: $" + getCostOfCart());
    }

    public void printDescriptions() {
        System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
        System.out.println("");
        System.out.println("Item Descriptions");
        for (ItemToPurchase cartItem: cartItems) {
            System.out.print(cartItem.getName() + ": ");
            cartItem.printItemDescripiton();
        }
    }
}
