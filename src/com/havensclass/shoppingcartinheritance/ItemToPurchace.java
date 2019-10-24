package com.havensclass.shoppingcartinheritance;

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

    protected static String name;
    protected static String description;
    protected static int price;
    protected static int quantity;

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

    public void printItemCost(ItemToPurchase item) {
        System.out.println(item.getName() + " " + item.getQuantity() + " @ $" + item.getPrice() + " = $" +
                item.getQuantity()*item.getPrice());
    }

    public void printItemDescripiton() {
        System.out.println(description);
    }
}
