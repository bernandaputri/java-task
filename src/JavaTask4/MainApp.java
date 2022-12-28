package JavaTask4;

import java.util.Scanner;

import JavaTask4.controller.OrderController;
import JavaTask4.repositories.OrderRepository;
import JavaTask4.services.BaseServices;
import JavaTask4.services.MenuService;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static OrderRepository orderRepository = new OrderRepository();
    static OrderController orderController = new OrderController(orderRepository);
    static String option, optionOrder;

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
        Boolean state = true;
        do {
            appMenu();

            switch (option) {
                case "1":
                    System.out.println();
                    MenuService.showFoodMenu();
                    MenuService.showBeverageMenu();
                    MenuService.showBundleMenu();
                    break;

                case "2":
                    BaseServices.clearScreen();
                    createOrder();
                    switch (optionOrder) {
                        case "1":
                            System.out.println();
                            MenuService.showFoodMenu();
                            orderController.saveOrders("food");
                            break;

                        case "2":
                            System.out.println();
                            MenuService.showBeverageMenu();
                            orderController.saveOrders("beverage");
                            break;

                        case "3":
                            System.out.println();
                            MenuService.showBundleMenu();
                            orderController.saveOrders("bundle");
                            break;

                        default:
                            System.out.println("Input tidak sesuai.");
                            break;
                    }
                    break;
                
                case "3":
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
            state = BaseServices.appMenuAction();
            BaseServices.clearScreen();
        } while (state);
    }
}