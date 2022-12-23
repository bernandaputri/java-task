package JavaTask2.Task2.childs;

import JavaTask2.Task2.parents.Persegi;
import JavaTask2.Task2.sevices.BangunRuang;

public class Kubus extends Persegi implements BangunRuang {

    public Kubus (double sisi) {
        super(sisi);
    }

    @Override
    public void gambarBangun() {
        System.out.println("BANGUN RUANG KUBUS");
        // super.gambarBangun();
    }

    @Override
    public void karakteristikBangun() {
        System.out.println("----------Karakteristik Kubus---------");
        System.out.println("1. Jumlah rusuk ada 12.");
        System.out.println("2. Jumlah titik sudut ada 8.");
        System.out.println("3. Sisi kubus berbentuk persegi (bujur sangkar).");
        System.out.println("4. Jumlah sisi ada 6.");
        System.out.println("5. Semua sudutnya siku-siku.");
        System.out.println("6. Punya 12 diagonal sisi dengan ukuran sama panjang.");
        System.out.println("7. Punya 4 diagonal ruang dengan ukuran yang sama panjang.");
        System.out.println("8. Punya 6 bidang diagonal yang berbentuk persegi panjang.");
        // super.karakteristikBangun();
    }

    @Override
    public double luasPermukaan() {
        double sisi = super.getSisi();
        double luasPermukaanKubus = 6 * sisi;
        return luasPermukaanKubus;
    }

    @Override
    public double volumeBangun() {
        double sisi = super.getSisi();
        double volumeKubus = sisi * sisi * sisi;
        return volumeKubus;
    }
    
}
