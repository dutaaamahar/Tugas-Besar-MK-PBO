package praktikum;

public class Tugas2a {

    public static void main(String args[]) {
        System.out.println("Tugas Mencetak Bintang :\n");
        
        bintang();
    }
    
    public static void bintang() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        for (int i = 8; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
