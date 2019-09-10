package havensclass.shoppingcart;

public class ItemToPurchase {
    public ItemToPurchase() {
        this.name = "none";
        this.price = 0;
        this.quantity = 0;
    }

    private String name;
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
}
