package JavaTask2.Task2.childs;

import JavaTask2.Task2.parents.Segitiga;
import JavaTask2.Task2.sevices.BangunRuang;

public class Prisma extends Segitiga implements BangunRuang {

    public Prisma (double a, double b, double c, double tinggiPrisma) {
        super(a, b, c);
        this.tinggi = tinggiPrisma;
    }

    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void gambarBangun() {
        System.out.println("BANGUN PRISMA SEGITIGA");
        // super.gambarBangun();
    }

    @Override
    public void karakteristikBangun() {
        System.out.println("----------Karakteristik Prisma Segitiga---------");
        System.out.println("1. Memiliki 6 titik sudut.");
        System.out.println("2. Memiliki 5 bidang sisi.");
        System.out.println("3. Memiliki 9 rusuk tegak");
        System.out.println("4. Alas dan atapnya kongruen.");
        System.out.println("5. Sisi samping berbentuk persegi panjang");
        // super.karakteristikBangun();
    }

    @Override
    public double luasPermukaan() {
        double luasPermukaanPrisma = (2 * super.luasBangun() + (super.kelilingBangun() * this.tinggi));
        return luasPermukaanPrisma;
    }

    @Override
    public double volumeBangun() {
        double volumePrisma = super.luasBangun() * this.tinggi;
        return volumePrisma;
    }
    
}
