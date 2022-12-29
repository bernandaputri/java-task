package JavaTask4.services.base;

import JavaTask4.models.Menu;
import JavaTask4.models.Order;
import JavaTask4.services.menu.MenuService;

public class BaseServices {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String action() {
        while (true) {
            String option = QuestionService.questionString("Ingin menambah/mengubah pesanan? (ubah/tambah/kembali) ");
            if (option.equalsIgnoreCase("tambah")) {
                return "tambah";
            } else if (option.equalsIgnoreCase("ubah")) {
                return "ubah";
            } else if (option.equalsIgnoreCase("kembali")) {
                return "kembali";
            } else {
                System.out.println("Silahkan input tambah/ubah/kembali.");
                continue;
            }
        }
    }

    public static Order addOrder(String menuType) {
        Menu menu = new Menu();

        if (menuType.equals("food")) {
            menu = MenuService.getFoodMenu().get((QuestionService.questionInteger("Silahkan input nomor pesanan makanan: ")) - 1);
        } else if (menuType.equals("beverage")) {
            menu = MenuService.getBeverageMenu().get((QuestionService.questionInteger("Silahkan input nomor pesanan makanan: ")) - 1);
        } else if (menuType.equals("bundle")) {
            menu = MenuService.getBundleMenu().get((QuestionService.questionInteger("Silahkan input nomor pesanan makanan: ")) - 1);
        }

        Integer quantity = QuestionService.questionInteger("Silahkan input banyaknya pesanan: ");
        Order order = new Order(menu, quantity);
        return order;
    }

    public static Boolean appMenuAction() {
        while (true) {
            String option = QuestionService.questionString("Ingin melakukan pemesanan/pembayaran? (y/n) ");
            if (option.equalsIgnoreCase("n")) {
                return false;
            } else if (option.equalsIgnoreCase("y")) {
            return true;
            } else {
                System.out.println("Silahkan input y atau n.");
                continue;
            }
        }
    }

    public static Order wantToEdit(Order order) {
        Integer quantity = QuestionService.questionInteger("Silahkan input banyaknya pesanan: ");
        order.setQuantity(quantity);
        return order;
    }

}
