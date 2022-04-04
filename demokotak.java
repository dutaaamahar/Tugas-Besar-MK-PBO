package praktikum;

class kotak {
    
    double panjang, lebar, tinggi;
}

class demokotak {

    public static void main(String args[]) {
        double volume;
        
        kotak k = new kotak();
        k.panjang = 3;
        k.lebar = 3;
        k.tinggi = 3;
        volume = k.panjang + k.lebar + k.tinggi;
        
        System.out.println("Volume Kotak = " + volume);
    }
}
