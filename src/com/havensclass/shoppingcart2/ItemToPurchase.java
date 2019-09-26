package com.havensclass.shoppingcart2;

class ItemToPurchase {

    public ItemToPurchase() {
        String name = "none";
        String description = "none";
        int price = 0;
        int quantity = 0;
    }

    public ItemToPurchase(String name, String description, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    protected String name;
    protected String description;
    protected int price;
    protected int quantity;

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

    public String getDescription() {
        return description;
    }

    public void printItemCost() {
        System.out.println(getName() + " " + quantity + " @ $" + price + " = $" +
                getQuantity()*getPrice());
    }

    public void printItemDescripiton() {
        System.out.println(description);
    }
}
