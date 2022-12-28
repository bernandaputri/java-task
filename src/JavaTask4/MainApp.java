package JavaTask4;

import java.util.Scanner;

import JavaTask4.controller.OrderController;
import JavaTask4.models.Menu;
import JavaTask4.repositories.MenuRepository;
import JavaTask4.services.MenuService;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static OrderController orderController = new OrderController();
    static MenuService<Menu, Integer> theMenu = new MenuRepository();
    static String option, optionMenu, optionOrder, optionOut;

    private static void appMenu() {
        System.out.println();
        System.out.println("========== RESTORAN AYAM GEPREK ==========");
        System.out.println("1. Lihat Daftar Menu");
        System.out.println("2. Input Pesanan");
        System.out.println("3. Pembayaran");
        System.out.print("Pilihan: ");
        option = input.nextLine();
    }

    private static void chooseMenu() {
        System.out.println();
        System.out.println("========== PESAN ==========");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Paket");
        System.out.print("Pilihan: ");
        optionMenu = input.nextLine();
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
                    do {
                        do {
                            chooseMenu();
                            System.out.println();

                            switch (optionMenu) {
                                case "1":
                                    theMenu.showFoodMenu();
                                    System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                                    optionOrder = input.nextLine();
                                    if (optionOrder.equalsIgnoreCase("tambah")) {
                                        System.out.println("untuk tambah");
                                        
                                    } else if (optionOrder.equalsIgnoreCase("ubah")) {
                                        System.out.println("untuk ubah");
                                    } else if (optionOrder.equalsIgnoreCase("kembali")) {
                                        break;
                                    } else {
                                        System.out.println("Pilihan tidak tersedia, silahkan ulangi.");
                                        System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                                        optionOrder = input.nextLine();
                                    }
                                    break;

                                case "2":
                                    theMenu.showBeverageMenu();
                                    System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                                    optionOrder = input.nextLine();
                                    if (optionOrder.equalsIgnoreCase("tambah")) {
                                        System.out.println("untuk tambah");
                                    } else if (optionOrder.equalsIgnoreCase("ubah")) {
                                        System.out.println("untuk ubah");
                                    } else if (optionOrder.equalsIgnoreCase("kembali")) {
                                        break;
                                    } else {
                                        System.out.println("Pilihan tidak tersedia, silahkan ulangi.");
                                        System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                                        optionOrder = input.nextLine();
                                    }
                                    break;

                                case "3":
                                    theMenu.showBundleMenu();
                                    System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                                    optionOrder = input.nextLine();
                                    if (optionOrder.equalsIgnoreCase("tambah")) {
                                        System.out.println("untuk tambah");
                                    } else if (optionOrder.equalsIgnoreCase("ubah")) {
                                        System.out.println("untuk ubah");
                                    } else if (optionOrder.equalsIgnoreCase("kembali")) {
                                        break;
                                    } else {
                                        System.out.println("Pilihan tidak tersedia, silahkan ulangi.");
                                        System.out.print("Ingin menambah/mengubah pesanan? (tambah/ubah/kembali) ");
                                        optionOrder = input.nextLine();
                                    }
                                    break;

                                default:
                                    System.out.println("Pilihan tidak tersedia.");
                                    break;
                            }
                        } while (optionMenu.equalsIgnoreCase("y"));
                    } while (optionMenu.equalsIgnoreCase("y"));
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