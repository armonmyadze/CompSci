package com.havensclass.shoppingcart;

import java.util.Scanner;

public class ShoppingCartManager {
    public ShoppingCartManager() {
    }

    static Scanner scnr = new Scanner(System.in);

    public static void main(String [] args) {
        String name;
        String date;
        int quantity;
        char choice;

        System.out.println("Enter Customer's Name:");
        name = scnr.nextLine();
        System.out.println("Enter Today's Date:");
        date = scnr.nextLine();
        System.out.println("");
        System.out.println("Customer Name: " + name);
        System.out.println("Today's Date: " + date);

        ShoppingCart cart = new ShoppingCart(name, date);

        choice = processChoice();

        if (choice != 'q') {
            printMenu();
            processChoice(choice);
        }
    }

    private static char printMenu() {
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
        System.out.print("Choose an option: ");
        choice = scnr.next().charAt(0);

        return choice;
    }

    static void processChoice(ShoppingCart cart) {
        char choice = scnr.next().charAt(0);
        String name;
        int quantity;
        switch (choice) {
            case 'a':
                ItemToPurchase item = new ItemToPurchase();
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                scnr.nextLine(); //Moving Scanner down
                item.setName(scnr.nextLine());
                System.out.println("Enter the item description:");
                item.setDescription(scnr.nextLine());
                System.out.println("Enter the item price:");
                item.setPrice(scnr.nextInt());
                System.out.println("Enter the item quantity:");
                item.setQuantity(scnr.nextInt());
                cart.addItem(item);
                break;

            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                name = scnr.nextLine();
                cart.removeItem(name);
                break;

            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                name = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                quantity = scnr.nextInt();

                //cart.modifyItem();
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
                break;
        }
    }

}
