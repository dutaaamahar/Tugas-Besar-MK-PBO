package praktikum;

import java.util.Scanner;

class bangunDatar {
    
    protected float luas, keliling;
    
    float luas() {
        System.out.println("Menghitung Luas Bangun Datar");
        return 0;
    }
    
    float keliling() {
        System.out.println("Menghitung Keliling Bangun Datar");
        return 0;
    }
}

class jajarGenjang extends bangunDatar {
    
    private float alas, tinggi, miring;
    
    public jajarGenjang(float alas, float tinggi, float miring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;
    }
    
    @Override
    public float luas() {
        return luas = this.alas * this.tinggi;
    }
    
    @Override
    public float keliling() {
        return keliling = 2 * (this.alas + this.miring);
    }
}

class persegiPanjang extends bangunDatar {
    
    private float panjang, lebar;
    
    public persegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float luas() {
        return luas = this.panjang * this.lebar;
    }
    
    @Override
    public float keliling() {
        return keliling = 2 * (this.panjang + this.lebar);
    }
}

class belahKetupat extends bangunDatar {
    
    private float d1, d2, sisi;
    
    public belahKetupat(float d1, float d2, float sisi) {
        this.d1 = d1;
        this.d2 = d2;
        this.sisi = sisi;
    }
    
    @Override
    public float luas() {
        return luas = this.d1 * this.d2 / 2;
    }
    
    @Override
    public float keliling() {
        return keliling = 4 * this.sisi;
    }
}

public class Soal_1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        float alas, tinggi, miring, panjang, lebar, d1, d2, sisi;
        
        System.out.println(" TUGAS BESAR PBO A2");
        System.out.println("==================================================");
        
        System.out.println("\n JAJAR GENJANG");
        
        System.out.print("\n Masukkan nilai Alas : ");
        alas = input.nextFloat();
        
        System.out.print(" Masukkan nilai Tinggi : ");
        tinggi = input.nextFloat();
        
        System.out.print(" Masukkan nilai Sisi Miring : ");
        miring = input.nextFloat();
        
        jajarGenjang jajarGenjang = new jajarGenjang(alas, tinggi, miring);
        
        System.out.println(" Menghitung Luas Jajar Genjang : " + jajarGenjang.luas());
        System.out.println(" Menghitung Keliling Jajar Genjang : " + jajarGenjang.keliling());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("\n PERSEGI PANJANG");
        
        System.out.print("\n Masukkan nilai Panjang : ");
        panjang = input.nextFloat();
        
        System.out.print(" Masukkan nilai Lebar : ");
        lebar = input.nextFloat();
        
        persegiPanjang persegiPanjang = new persegiPanjang(panjang, lebar);
        
        System.out.println(" Menghitung Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println(" Menghitung Keliling Persegi Panjang : " + persegiPanjang.keliling());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("\n BELAH KETUPAT");
        
        System.out.print("\n Masukkan nilai Diagonal 1 : ");
        d1 = input.nextFloat();
                
        System.out.print(" Masukkan nilai Diagonal 2 : ");
        d2 = input.nextFloat();
        
        System.out.print(" Masukkan nilai Sisi : ");
        sisi = input.nextFloat();
        
        belahKetupat belahKetupat = new belahKetupat(d1, d2, sisi);
        
        System.out.println(" Menghitung Luas Belah Ketupat : " + belahKetupat.luas());
        System.out.println(" Menghitung Keliling Belah Ketupat : " + belahKetupat.keliling());
        
    }
}
