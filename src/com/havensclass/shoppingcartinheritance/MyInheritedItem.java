package com.havensclass.shoppingcartinheritance;

public class MyInheritedItem extends ItemToPurchase {
    public MyInheritedItem() {
        super();
    }

    public MyInheritedItem(String name, String description, int price, int quantity, String stringy, int inty) {
        super(name, description, price, quantity);
        this.stringy = stringy;
        this.inty = inty;
    }

    private String stringy;
    private int inty;


    public String toString() {
        String string;

        string = name + " " + description + " " + price + " " + quantity + " " + stringy + " " + inty;

        return string;
    }

}
