package JavaTask4.models;

public class Menu {
    private String menuName;
    private Double menuPrice;

    public Menu(String menuName, Double menuPrice) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }
}
