package praktikum;

import java.util.Scanner;

class Lingkaran {
    
    private double pi, jari2;
    
    public void Input(double p,double r) {
        this.pi = p;
        this.jari2 = r;
    }
    
    public double Luas() {
        return pi * jari2 * jari2;
    }
    
    public double Keliling() {
        return 2 * pi * jari2;
    }
}

public class Tugas5 extends Lingkaran {

    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        
        double pi = 3.14;
        double jari2;
        
        Lingkaran L = new Lingkaran();
        
        System.out.println(" Luas Lingkaran ");
        System.out.println("================================================");
        
        System.out.print(" Masukkan Nilai Jari-Jari = ");
        jari2 = Input.nextInt();
        
        L.Input(pi, jari2);
        
        System.out.println(" Maka Luas Lingkaran = " + L.Luas());
        
        System.out.println("\n Keliling Lingkaran ");
        System.out.println("================================================");
        
        System.out.print(" Masukkan Nilai Jari-Jari = ");
        jari2 = Input.nextInt();
        
        L.Input(pi, jari2);
        
        System.out.println(" Maka Keliling Lingkaran = " + L.Keliling());
        
    }
}
