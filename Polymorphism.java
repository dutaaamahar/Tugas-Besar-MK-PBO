package praktikum;

import java.util.Scanner;        
        
class kendaraan {
    
    private int posisi;
    
    public kendaraan(int posisi){
        this.posisi = posisi;
    }
    
    public void jalan(int a) {
        return;
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }
    
}

class mobil extends kendaraan{
    
    public mobil(int posisi) {
        super(posisi);
    }
    
    @Override
    public void jalan(int a) {
        setPosisi(getPosisi() + a);
    }
}

class motor extends kendaraan{
    
    public motor(int posisi) {
        super(posisi);
    }
    
    @Override
    public void jalan(int a) {
        setPosisi(getPosisi() + a);
    }
}

class pesawat extends kendaraan{
    
    public pesawat(int posisi) {
        super(posisi);
    }
    
    @Override
    public void jalan(int a) {
        setPosisi(getPosisi() + a);
    }
}

public class Polymorphism {
    
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        
        kendaraan buatKendaraan[] = new kendaraan[3];
        
        int posisi_awal = 10;
        
        System.out.print("Masukkan laju mobil = ");
        int lajuMobil  = k.nextInt();
        System.out.print("Masukkan laju motor = ");
        int lajuMotor  = k.nextInt();
        System.out.print("Masukkan laju pesawat = ");
        int lajuPesawat  = k.nextInt();
        
        buatKendaraan[0] = new mobil(posisi_awal);
        buatKendaraan[1] = new motor(posisi_awal);
        buatKendaraan[2] = new pesawat(posisi_awal);
        
        System.out.println("Posisi kendaraan sebelum dijalankan");
        System.out.println("===================================");
        System.out.println("1. Posisi Mobil = " + posisi_awal);
        System.out.println("2. Posisi Motor = " + posisi_awal);
        System.out.println("3. Posisi Pesawat = " + posisi_awal);
        System.out.println("\n\n Posisi kendaraan setelah dijalankan");
        System.out.println("===================================");
        
        buatKendaraan[0].jalan(lajuMobil);
        System.out.println("Posisi Mobil saat ini = " + buatKendaraan[0].getPosisi());
        buatKendaraan[1].jalan(lajuMotor);
        System.out.println("Posisi Mobil saat ini = " + buatKendaraan[1].getPosisi());
        buatKendaraan[2].jalan(lajuPesawat);
        System.out.println("Posisi Mobil saat ini = " + buatKendaraan[2].getPosisi());
        
    }
}
