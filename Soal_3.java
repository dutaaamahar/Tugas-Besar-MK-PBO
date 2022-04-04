package praktikum;

class tabung {
    
    protected float jari2, tinggi;
    
    public void tabung(float jari2, float tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public void setJari2(float jari2) {
        this.jari2 = jari2;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getJari2() {
        return jari2;
    }

    public float getTinggi() {
        return tinggi;
    }
}

class tutup extends tabung {
    
    protected float pi = 3.14F;
    
    public void tutup(float jari2, float tinggi) {
        super.tabung(jari2, tinggi);
    }
    
    public float luas() {
        return pi * jari2 * jari2;
    }
    
    public void tampil() {
        System.out.println(" Jari-jari : " + jari2);
        System.out.println(" Luas Tutup : " + luas());
    }
}

class alas extends tutup {
    
    public void alas(float jari2, float tinggi) {
        super.tabung(jari2, tinggi);
    }
    
    @Override
    public float luas() {
        return pi * jari2 * jari2;
    }
    
    @Override
    public void tampil() {
        System.out.println(" Jari-jari : " + jari2);
        System.out.println(" Luas Alas : " + luas());
    }
}

class selimut extends tabung {
    
    private float diameter;
    
    public void selimut(float diameter, float jari2, float tinggi){
        this.diameter = diameter;
        
        super.tabung(jari2, tinggi);
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }
    
    public float luas() {
        return diameter * tinggi;
    }
    
    public void tampil() {
        System.out.println(" Diameter : " + diameter);
        System.out.println(" Luas Selimut : " + luas());
    }
}

public class Soal_3 {

    public static void main(String args[]) {
        float diameter, jari2, tinggi;
        
        tabung tabung = new tabung();
        tutup tutup = new tutup();
        alas alas = new alas();
        selimut selimut = new selimut();
        
        tabung.jari2 = 8;
        tabung.tinggi = 1;
        
        System.out.println(" NIM : 20200410700071");
        System.out.println(" Jari-jari : 7 + 1 => 8");
        System.out.println(" Tinggi : 1");
        System.out.println("==================================================");
        
        tutup.tutup(tabung.jari2, tabung.tinggi);
        tutup.tampil();
        
        System.out.println("--------------------------------------------------");
        
        alas.alas(tabung.jari2, tabung.tinggi);
        alas.tampil();
        
        System.out.println("--------------------------------------------------");
        
        selimut.setDiameter(diameter = 2 * tabung.jari2);
        
        selimut.selimut(diameter, tabung.jari2, tabung.tinggi);
        selimut.tampil();
        
    }
}
