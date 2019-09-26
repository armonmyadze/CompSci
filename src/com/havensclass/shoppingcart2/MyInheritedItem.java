package com.havensclass.shoppingcart2;

public class MyInheritedItem extends ItemToPurchase {
    public MyInheritedItem() {
        super();
    }

    public MyInheritedItem(String name, String description, int price, int quantity, String string, int integer) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.string = string;
        this.integer = integer;
    }

    private String string;
    private int integer;

}
