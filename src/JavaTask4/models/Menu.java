package JavaTask4.models;

public class Menu {
    private String menuName;
    private Double menuPrice;

    public Menu() {
    }

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

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }
}
