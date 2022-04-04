package praktikum;

class Lingkaran {
    
    double jari2;
    
    double Luas(double j) {
        jari2 = j;
         
        return (3.14 * jari2 * jari2);
    }
    
    double Kel(double j) {
        jari2 = j;
        
        return (2 * 3.14 * jari2);
    }
}

class PersegiPanjang {
    
    double p, lb;
    
    double Kel(double p, double lb) {
        return (2 * (p + lb));
    }
    
    double Luas(double p, double lb) {
        return (p * lb);
    }
}
    

class Trapesium {
    
    double alas_a, alas_b, tinggi, sisi_miring;
    
    double Luas(double a, double b, double t) {
        alas_a = a;
        alas_b = b;
        tinggi = t;
        
        return (((alas_a + alas_b) * tinggi) / 2);
    }
    
    double Kel(double a, double b, double t, double m) {
        alas_a = a;
        alas_b = b;
        tinggi = t;
        sisi_miring = m;
        
        return (alas_a + alas_b + tinggi + sisi_miring);
    }
}

public class Tugas2b {

    public static void main(String args[]) {
        Lingkaran l = new Lingkaran();
        PersegiPanjang p = new PersegiPanjang();
        Trapesium t = new Trapesium();
        
        System.out.println("Luas Lingkaran = " + l.Luas(10));
        System.out.println("Keliling Lingkaran = " + l.Kel(10));
        System.out.println("Luas Persegi Panjang = " + p.Luas(10, 5));
        System.out.println("Keliling Persegi Panjang = " + p.Kel(10, 5));
        System.out.println("Luas Trapesium = " + t.Luas(3, 6, 4));
        System.out.println("Keliling Trapesium = " + t.Kel(3, 6, 4, 5));
    }
}
