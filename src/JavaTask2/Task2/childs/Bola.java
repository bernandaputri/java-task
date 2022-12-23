package JavaTask2.Task2.childs;

import JavaTask2.Task2.parents.Lingkaran;
import JavaTask2.Task2.sevices.BangunRuang;

public class Bola extends Lingkaran implements BangunRuang {

    public Bola (double r) {
        super(r);
    }

    @Override
    public void gambarBangun() {
        System.out.println("BANGUN RUANG BOLA");
        // super.gambarBangun();
    }

    @Override
    public void karakteristikBangun() {
        System.out.println("----------Karakteristik Bola---------");
        System.out.println("1. Tidak memiliki rusuk dan titik sudut.");
        System.out.println("2. Memiliki satu bidang sisi lengkung, yakni selimut bola.");
        System.out.println("3. Terdapat jari-jari dan diameter.");
        System.out.println("4. Memiliki luas permukaan dan volume.");
        // super.karakteristikBangun();
    }

    @Override
    public double luasPermukaan() {
        double r = super.getR();
        double luasPermukaanBola = 4 * Math.PI * r;
        return luasPermukaanBola;
    }

    @Override
    public double volumeBangun() {
        double r = super.getR();
        double volumeBola = 4 / 3 * Math.PI * r * r * r;
        return volumeBola;
    }
    
}
