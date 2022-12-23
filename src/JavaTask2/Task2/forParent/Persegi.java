package JavaTask2.Task2.forParent;

import JavaTask2.Task2.sevices.BangunDatar;

public class Persegi implements BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void gambarBangun() {
        System.out.println("BANGUN PERSEGI");
    }

    @Override
    public void karakteristikBangun() {
        System.out.println("----------Karakteristik Persegi---------");
        System.out.println("1. Memiliki sisi-sisi yang sama panjang.");
        System.out.println("2. Memiliki empat sudut siku-siku yang sama besar, yakni 90 derajat.");
        System.out.println("3. Memiliki empat titik sudut.");
        System.out.println("4. Memiliki 2 diagonal yang sama panjang.");
        System.out.println("5. Memiliki 4 simetri lipat dan 4 simetri putar.");
    }

    @Override
    public double kelilingBangun() {
        double kelilingPersegi = 4 * this.sisi;
        return kelilingPersegi;
    }

    @Override
    public double luasBangun() {
        double luasPersegi = this.sisi * this.sisi;
        return luasPersegi;
    }

}
