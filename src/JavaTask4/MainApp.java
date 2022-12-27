package JavaTask4;

import java.util.Scanner;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static String option;
    
    private static void appMenu() {
        System.out.println("----------DAPUR PUTRI----------");
        System.out.println("1. Lihat Daftar Menu");
        System.out.println("2. Input Pesanan");
        System.out.println("3. Pembayaran");
        System.out.print("Pilihan: ");
        option = input.nextLine();
    }

    private static void menuMakanan() {
        System.out.println("----------MENU MAKANAN----------");
        System.out.println("1. Ayam Gepuk\t\t18000");
        System.out.println("2. Sate Kulit\t\t4500");
        System.out.println("3. Sate Usus\t\t4500");
        System.out.println("4. Sate Telur Puyuh\t4500");
        System.out.println("5. Tahu\t\t\t2000");
        System.out.println("6. Tempe\t\t2000");
        System.out.println("7. Nasi Putih\t\t5000");
    }

    private static void menuMinuman() {
        System.out.println("----------MENU MINUMAN----------");
        System.out.println("1. Es Teh Manis\t\t4000");
        System.out.println("2. Teh Manis Panas\t3500");
        System.out.println("3. Es Jeruk Manis\t8000");
        System.out.println("4. Jeruk Manis Panas\t7500");
        System.out.println("5. Air Mineral\t\t4500");
    }

    private static void menuPaket() {
        System.out.println("------------------------------------------PAKET HEMAT------------------------------------------");
        System.out.println("1. Nasi + Ayam Gepuk + Es Teh Manis\t\t\t\t\t\t\t25000");
        System.out.println("2. Nasi + Ayam Gepuk + Tahu + Tempe + Es Teh Manis\t\t\t\t\t28000");
        System.out.println("3. Nasi + Ayam Gepuk + Tahu + Tempe + Sate (Kulit/Usus/Telur Puyuh) Es Teh Manis\t33000");
    }

    public static void main(String[] args) {
        
    }
}