package com.havensclass.shoppingcart;

public class ItemToPurchase {
    public ItemToPurchase() {
        this.name = "none";
        this.price = 0;
        this.quantity = 0;
        this.description = "none";
    }

    private String name;
    private String description;
    private int price;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printItemCost() {
        System.out.println(getName() + " " + quantity + " @ $" + price + " = $" +
                getQuantity()*getPrice());
    }

    public void printItemDescripiton() {
        System.out.println(getName() + ": " + description);
    }
}
