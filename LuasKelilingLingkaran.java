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

public class LuasKelilingLingkaran {

    public static void main(String args[]) {
        Lingkaran l = new Lingkaran();
        
        System.out.println("Luas Lingkaran = " + l.Luas(10));
        System.out.println("Keliling Lingkaran = " + l.Kel(10));
    }
}
