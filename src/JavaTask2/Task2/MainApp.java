package JavaTask2.Task2;

import java.util.Scanner;

import JavaTask2.Task2.childs.Bola;
import JavaTask2.Task2.childs.Kubus;
import JavaTask2.Task2.childs.Prisma;
import JavaTask2.Task2.parents.Lingkaran;
import JavaTask2.Task2.parents.Persegi;
import JavaTask2.Task2.parents.Segitiga;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static String opsi;

    static Persegi persegi;
    static Segitiga segitiga;
    static Lingkaran lingkaran;

    static Kubus kubus;
    static Prisma prisma;
    static Bola bola;

    public static void appMenu() {
        System.out.println("=== Pilih menu Geometri ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kubus");
        System.out.println("5. Prisma Segitiga");
        System.out.println("6. Bola");
        System.out.print("Menu pilihan: ");
        opsi = input.nextLine();
    }

    public static void main(String[] args) throws Exception {
        do {
            appMenu();

            switch (opsi) {
                case "1":
                    System.out.println("----------Persegi----------");
                    System.out.print("Input panjang sisi persegi (dalam cm): ");
                    double sisi = Double.valueOf(input.nextLine());
                    Persegi persegi = new Persegi(sisi);

                    System.out.println();
                    persegi.gambarBangun();
                    persegi.karakteristikBangun();
                    System.out.println("Keliling persegi adalah " + persegi.kelilingBangun() + " cm.");
                    System.out.println("Luas persegi adalah " + persegi.luasBangun() + " cm persegi.");
                    break;

                case "2":
                    System.out.println("----------Segitiga----------");
                    System.out.print("Input panjang sisi A segitiga (dalam cm): ");
                    double sisiA = Double.valueOf(input.nextLine());
                    System.out.print("Input panjang sisi B segitiga (dalam cm): ");
                    double sisiB = Double.valueOf(input.nextLine());
                    System.out.print("Input panjang sisi C segitiga (dalam cm): ");
                    double sisiC = Double.valueOf(input.nextLine());
                    Segitiga segitiga = new Segitiga(sisiA, sisiB, sisiC);

                    System.out.println();
                    segitiga.gambarBangun();
                    segitiga.karakteristikBangun();
                    System.out.println("Keliling segitiga adalah " + segitiga.kelilingBangun() + " cm.");
                    System.out.println("Luas segitiga adalah " + segitiga.luasBangun() + " cm persegi.");
                    break;

                case "3":
                    System.out.println("----------Lingkaran----------");
                    System.out.print("Input panjang jari-jari lingkaran (dalam cm): ");
                    double radius = Double.valueOf(input.nextLine());
                    Lingkaran lingkaran = new Lingkaran(radius);

                    System.out.println();
                    lingkaran.gambarBangun();
                    lingkaran.karakteristikBangun();
                    System.out.println("Keliling lingkaran adalah " + lingkaran.kelilingBangun() + " cm.");
                    System.out.println("Luas lingkaran adalah " + lingkaran.luasBangun() + " cm persegi.");
                    break;

                case "4":
                    System.out.println("----------Kubus----------");
                    System.out.print("Input panjang sisi kubus (dalam cm): ");
                    double sisiKubus = Double.valueOf(input.nextLine());
                    Kubus kubus = new Kubus(sisiKubus);

                    System.out.println();
                    kubus.gambarBangun();
                    kubus.karakteristikBangun();
                    System.out.println("Luas permukaan kubus adalah " + kubus.luasPermukaan() + " cm persegi.");
                    System.out.println("Volume kubus adalah " + kubus.volumeBangun() + " cm kubik.");
                    break;

                case "5":
                    System.out.println("----------Prisma----------");
                    System.out.print("Input sisi alas A (dalam cm): ");
                    double sisiAlasA = Double.valueOf(input.nextLine());
                    System.out.print("Input sisi alas B (dalam cm): ");
                    double sisiAlasB = Double.valueOf(input.nextLine());
                    System.out.print("Input sisi alas C (dalam cm): ");
                    double sisiAlasC = Double.valueOf(input.nextLine());
                    System.out.print("Input tinggiPrisma (dalam cm): ");
                    double tinggiPrisma = Double.valueOf(input.nextLine());
                    Prisma prisma = new Prisma(sisiAlasA, sisiAlasB, sisiAlasC, tinggiPrisma);

                    System.out.println();
                    prisma.gambarBangun();
                    prisma.karakteristikBangun();
                    System.out.println("Luas permukaan prisma adalah " + prisma.luasPermukaan() + " cm persegi.");
                    System.out.println("Volume prisma adalah " + prisma.volumeBangun() + " cm kubik.");
                    break;

                case "6":
                    System.out.println("----------Bola----------");
                    System.out.print("Input panjang jari-jari bola (dalam cm): ");
                    double radiusBola = Double.valueOf(input.nextLine());
                    Bola bola = new Bola(radiusBola);

                    System.out.println();
                    bola.gambarBangun();
                    bola.karakteristikBangun();
                    System.out.println("Luas permukaan bola adalah " + bola.luasPermukaan() + " cm persegi.");
                    System.out.println("Volume bola adalah " + bola.volumeBangun() + " cm kubik.");
                    break;

                default:
                    System.out.println("Input tidak sesuai.");
                    break;
            }
            System.out.print("Keluar dari menu? (y/n) ");
            opsi = input.nextLine();
        } while (opsi.equalsIgnoreCase("n"));
    }
}
