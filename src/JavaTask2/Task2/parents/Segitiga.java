package JavaTask2.Task2.parents;

import JavaTask2.Task2.sevices.BangunDatar;

public class Segitiga implements BangunDatar {
    private double a, b, c; // a dan b sebagai sisi tegak (alas dan tinggi)

    public double getA() {
        return a;
    }
    // public void setA(double a) {
    //     this.a = a;
    // }
    public double getB() {
        return b;
    }
    // public void setB(double b) {
    //     this.b = b;
    // }
    public double getC() {
        return c;
    }
    // public void setC(double c) {
    //     this.c = c;
    // }
    public Segitiga(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void gambarBangun() {
        System.out.println("BANGUN SEGITIGA SIKU-SIKU");
    }

    @Override
    public void karakteristikBangun() {
        System.out.println("----------Karakteristik Segitiga Siku-siku---------");
        System.out.println("1. Memiliki satu sisi miring.");
        System.out.println("2. Tidak memiliki sumbu simetri lipat.");
        System.out.println("3. Memiliki dua sisi yang saling tegak lurus.");
        System.out.println("4. Tidak memiliki sumbu simetri putar.");
        System.out.println("5. Salah satu sudutnya, yaitu sudut siku-siku sebesar 90 derajat.");
        System.out.println("6. Menggunakan rumus phytagoras dalam mencari panjang sisi miringnya.");
    }

    @Override
    public double kelilingBangun() {
        double kelilingSegitiga = this.a + this.b + this.c;
        return kelilingSegitiga;
    }

    @Override
    public double luasBangun() {
        double luasSegitiga = 0.5 * this.a * this.b; 
        return luasSegitiga;
    }
}
