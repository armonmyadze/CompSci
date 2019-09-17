package com.havensclass.shoppingcart;

import java.util.Scanner;

public class ShoppingCartManager {
    public ShoppingCartManager() {
    }

    static Scanner scnr = new Scanner(System.in);
    static boolean qIsPressed;

    public static void main(String [] args) {
        String name;
        String date;

        System.out.println("Enter Customer's Name:");
        name = scnr.nextLine();
        System.out.println("Enter Today's Date:");
        date = scnr.nextLine();
        System.out.println("");
        System.out.println("Customer Name: " + name);
        System.out.println("Today's Date: " + date);

        ShoppingCart cart = new ShoppingCart(name, date);

        while (!qIsPressed) {
            printMenu();
            processChoice(cart);
        }
    }

    private static void printMenu() {
        char choice;

        System.out.println("MENU");
        System.out.println("");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("");
        System.out.println("Choose an option: ");
    }

    static void processChoice(ShoppingCart cart) {
        char choice = scnr.next().charAt(0);
        String name;
        String description;
        int price;
        int quantity;
        switch (choice) {
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                scnr.nextLine(); //move scanner down
                name = scnr.nextLine();
                System.out.println("Enter the item description:");
                description = scnr.nextLine();
                System.out.println("Enter the item price:");
                price = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                quantity = scnr.nextInt();
                ItemToPurchase item = new ItemToPurchase(name, description, price, quantity);
                cart.addItem(item);
                break;

            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                scnr.nextLine();
                name = scnr.nextLine();
                cart.removeItem(name);
                break;

            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.print("Enter the item name: ");
                name = scnr.nextLine();
                System.out.print("Enter the new quantity: ");
                quantity = scnr.nextInt();

                ItemToPurchase modItem = new ItemToPurchase();

                modItem.setName(name);
                modItem.setQuantity(quantity);

                cart.modifyItem(modItem);
                break;

            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();
                break;

            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                break;

            case 'q':
                qIsPressed = true;
                break;
        }
    }

}
