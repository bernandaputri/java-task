package JavaTask4.services.menu;

import java.util.ArrayList;
import java.util.List;

import JavaTask4.models.Menu;

public class MenuService {
    private static List<Menu> foodMenu = new ArrayList<>() {
        {
            add(new Menu("Ayam Geprek", 14000.0));
            add(new Menu("Lele", 10000.0));
            add(new Menu("Nasi Putih", 4000.0));
            add(new Menu("Sate Usus", 3000.0));
            add(new Menu("Sate Kulit", 3000.0));
            add(new Menu("Sate Ati Ampela", 3000.0));
            add(new Menu("Sate Telur Puyuh", 3000.0));
            add(new Menu("Tahu", 1500.0));
            add(new Menu("Tempe", 1500.0));
        }
    };

    private static List<Menu> beverageMenu = new ArrayList<>() {
        {
            add(new Menu("Teh Manis Panas", 3000.0));
            add(new Menu("Teh Manis Dingin", 3000.0));
            add(new Menu("Fanta", 5000.0));
            add(new Menu("Sprite", 5000.0));
            add(new Menu("Coca-Cola", 5000.0));
            add(new Menu("Air Mineral", 2500.0));
            add(new Menu("Kopi Hitam", 3000.0));
        }
    };

    private static List<Menu> bundleMenu = new ArrayList<>() {
        {
            add(new Menu("Paket A : Ayam Geprek + Nasi + Es Teh Manis", 20000.0));
            add(new Menu("Paket B: Ayam Geprek + Nasi + Tahu + Tempe + Es Teh Manis", 23000.0));
            add(new Menu("Paket C: Ayam Geprek + Nasi + Tahu + Tempe + Sate(Kulit/Usus/Ati Ampela) + Es Teh Manis",
                    25000.0));
        }
    };

    public static void showBeverageMenu() {
        System.out.println("======== MENU MINUMAN ========");
        for (Menu beveragesMenu : beverageMenu) {
            Integer id = beverageMenu.indexOf(beveragesMenu) + 1;
            System.out.println(id + ". " + beveragesMenu.getMenuName() + " - " + beveragesMenu.getMenuPrice());
        }
        System.out.println();
    }

    public static void showBundleMenu() {
        System.out.println("============================================ PAKET HEMAT ============================================");
        for (Menu bundlesMenu : bundleMenu) {
            Integer id = bundleMenu.indexOf(bundlesMenu) + 1;
            System.out.println(id + ". " + bundlesMenu.getMenuName() + " - " + bundlesMenu.getMenuPrice());
        }
        System.out.println();
    }

    public static void showFoodMenu() {
        System.out.println("======== MENU MAKANAN ========");
        for (Menu foodsMenu : foodMenu) {
            Integer id = foodMenu.indexOf(foodsMenu) + 1;
            System.out.println(id + ". " + foodsMenu.getMenuName() + " - " + foodsMenu.getMenuPrice());
        }
        System.out.println();
    }

    public static List<Menu> getFoodMenu() {
        return foodMenu;
    }

    public static List<Menu> getBeverageMenu() {
        return beverageMenu;
    }

    public static List<Menu> getBundleMenu() {
        return bundleMenu;
    }
}
