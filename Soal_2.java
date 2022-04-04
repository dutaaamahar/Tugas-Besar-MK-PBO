package praktikum;

import java.util.Scanner;

class gaji {
    
    protected int gaji_pokok, tunjangan;
    
    public void gaji(int gaji_pokok, int tunjangan) {
        this.gaji_pokok = gaji_pokok;
        this.tunjangan = tunjangan;
    }
    
    public int totalGaji() {
        return gaji_pokok + tunjangan;
    }
}

class hrd extends gaji {
    
    public hrd(int gaji_pokok, int tunjangan) {
        super.gaji(gaji_pokok, tunjangan);
    }
    
    @Override
    public int totalGaji() {
        return gaji_pokok + tunjangan;
    }
    
    public void tampil(int gaji_pokok, int tunjangan) {
        System.out.println("\n Gaji Pokok : " + gaji_pokok);
        System.out.println(" Tunjangan Keahlian : " + tunjangan);
        System.out.println(" Total Gaji : " + totalGaji());
    }
}

class kepalaDivisi extends gaji {
    
    public kepalaDivisi(int gaji_pokok, int tunjangan) {
        super.gaji(gaji_pokok, tunjangan);
    }
    
    @Override
    public int totalGaji() {
        return gaji_pokok + tunjangan;
    }
    
    public void tampil(int gaji_pokok, int tunjangan) {
        System.out.println("\n Gaji Pokok : " + gaji_pokok);
        System.out.println(" Tunjangan Keahlian : " + tunjangan);
        System.out.println(" Total Gaji : " + totalGaji());
    }
}

class karyawan extends gaji {
    
    public karyawan(int gaji_pokok, int tunjangan) {
        super.gaji(gaji_pokok, tunjangan);
    }
    
    @Override
    public int totalGaji() {
        return gaji_pokok + tunjangan;
    }
    
    public void tampil(int gaji_pokok, int tunjangan) {
        System.out.println("\n Gaji Pokok : " + gaji_pokok);
        System.out.println(" Tunjangan Keahlian : " + tunjangan);
        System.out.println(" Total Gaji : " + totalGaji());
    }
}

public class Soal_2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int gaji_pokok, tunjangan;
        
        System.out.println(" TUGAS BESAR PBO A2");
        System.out.println("==================================================");
        
        System.out.println("\n SLIP GAJI HRD");
        System.out.print("\n Masukkan Gaji Pokok : ");
        gaji_pokok = input.nextInt();
        
        System.out.print(" Masukkan Tunjangan Keahlian : ");
        tunjangan = input.nextInt();
        
        hrd hrd = new hrd(gaji_pokok, tunjangan);
        
        hrd.tampil(gaji_pokok, tunjangan);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("\n SLIP GAJI KEPALA DIVISI");
        System.out.print("\n Masukkan Gaji Pokok : ");
        gaji_pokok = input.nextInt();
        
        System.out.print(" Masukkan Tunjangan Keahlian : ");
        tunjangan = input.nextInt();
        
        kepalaDivisi kepalaDivisi = new kepalaDivisi(gaji_pokok, tunjangan);
        
        kepalaDivisi.tampil(gaji_pokok, tunjangan);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("\n SLIP GAJI KARYAWAN");
        System.out.print("\n Masukkan Gaji Pokok : ");
        gaji_pokok = input.nextInt();
        
        System.out.print(" Masukkan Tunjangan Keahlian : ");
        tunjangan = input.nextInt();
        
        karyawan karyawan = new karyawan(gaji_pokok, tunjangan);
        
        karyawan.tampil(gaji_pokok, tunjangan);
    }
}
