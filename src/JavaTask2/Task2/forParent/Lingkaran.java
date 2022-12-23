package JavaTask2.Task2.forParent;

import JavaTask2.Task2.sevices.BangunDatar;

public class Lingkaran implements BangunDatar {
    private double r;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public void gambarBangun() {
        System.out.println("BANGUN LINGKARAN");
    }

    @Override
    public void karakteristikBangun() {
        System.out.println("----------Karakteristik Lingkaran---------");
        System.out.println("1. Jumlah sudut lingkaran adalah 360°.");
        System.out.println("2. Memiliki sumbu simetri yang tidak terhingga.");
        System.out.println("3. Memiliki 1 sisi berupa garis lengkung tertutup.");
        System.out.println("4. Memiliki simetri lipat yang jumlahnya tidak terhingga.");
        System.out.println("5. Memiliki simetri putar yang jumlahnya tidak terhingga.");
        System.out.println("6. Memiliki 1 titik pusat (O) tepat di tengah-tengah lingkaran.");
    }
    
    @Override
    public double kelilingBangun() {
        double kelilingLingkaran = 2 * Math.PI * this.r;
        return kelilingLingkaran;
    }

    @Override
    public double luasBangun() {
        double luasLingkaran = Math.PI * this.r * this.r;
        return luasLingkaran;
    }
}
