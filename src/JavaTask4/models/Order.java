package JavaTask4.models;

public class Order {
    private String chosenMenu;
    private Integer quantity;
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getChosenMenu() {
        return chosenMenu;
    }

    public void setChosenMenu(String chosenMenu) {
        this.chosenMenu = chosenMenu;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
