package JavaTask4.services.base;

import java.util.List;

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
            String option = QuestionService.questionString("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
            if (option.equalsIgnoreCase("tambah")) {
                return "add";
            } else if (option.equalsIgnoreCase("ubah")) {
                return "change";
            } else if (option.equalsIgnoreCase("kembali")) {
                return "back";
            } else {
                System.out.println("Silahkan input tambah/ubah/kembali.");
                continue;
            }
        }
    }

    public static Order addOrder(String menuType) {
        Menu menu = new Menu();
        int index;

        if (menuType.equals("food")) {
            index = QuestionService.questionInteger("Silahkan input nomor pesanan makanan: ");
            menu = MenuService.getFoodMenu().get(index - 1);
        } else if (menuType.equals("beverage")) {
            index = QuestionService.questionInteger("Silahkan input nomor pesanan minuman: ");
            menu = MenuService.getBeverageMenu().get(index - 1);
        } else if (menuType.equals("bundle")) {
            index = QuestionService.questionInteger("Silahkan input nomor pesanan paket: ");
            menu = MenuService.getBundleMenu().get(index - 1);
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
