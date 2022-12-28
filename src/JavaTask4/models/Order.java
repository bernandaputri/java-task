package JavaTask4.models;

public class Order {
    private Menu menu;
    private Integer quantity;

    public Order() {
    }

    public Order(Menu menu, Integer quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
