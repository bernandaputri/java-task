package JavaTask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JavaTask4.controller.OrderController;
import JavaTask4.models.Menu;
import JavaTask4.models.Order;
import JavaTask4.repositories.MenuRepository;
import JavaTask4.services.MenuService;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static OrderController orderController = new OrderController();
    static MenuService<Menu, Integer> theMenu = new MenuRepository();
    static int index;
    static List<Menu> menu;
    static Order order = new Order();
    static String option, optionMenu, optionOrder, optionOut, optionAddOrder;

    private static void appMenu() {
        System.out.println();
        System.out.println("========== RESTORAN AYAM GEPREK ==========");
        System.out.println("1. Lihat Daftar Menu");
        System.out.println("2. Input Pesanan");
        System.out.println("3. Pembayaran");
        System.out.print("Pilihan: ");
        option = input.nextLine();
    }

    private static void createOrder() {
        System.out.println();
        System.out.println("========== PESAN ==========");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Paket");
        System.out.print("Pilihan: ");
        optionOrder = input.nextLine();
    }

    public static void main(String[] args) {
        do {
            appMenu();

            switch (option) {
                case "1":
                    System.out.println();
                    theMenu.showFoodMenu();
                    theMenu.showBeverageMenu();
                    theMenu.showBundleMenu();
                    break;

                case "2":
                    createOrder();
                    switch (optionOrder) {
                        case "1":
                            theMenu.showFoodMenu();
                            // System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                            // optionMenu = input.nextLine();
                            System.out.print("Silahkan input nomor pesanan makanan: ");
                            optionAddOrder = input.nextLine();
                            index = Integer.parseInt(optionAddOrder);
                            System.out.println(menu.get(index));
                            // order = new Order();
                            // order.setChosenMenu(menu.get(index).getMenuName());
                            break;
                    
                        default:
                            break;
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
            System.out.print("Ingin melakukan pemesanan/pembayaran? (y/n) ");
            optionOut = input.nextLine();
        } while (optionOut.equalsIgnoreCase("y"));
    }
}