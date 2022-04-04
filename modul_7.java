package praktikum;

public class modul_7 {

    public static void main(String args[]) {
        // Deklarasi array
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        // Cetak Array per indeks
        System.out.println(hari[0] + " " + hari[1] + " " + hari[2]);
        
        
        // Cetak array dengan perulangan
        for(int i = 0; i < 7; i++) {
            System.out.println(hari[i]);
        }
        
    }
}
