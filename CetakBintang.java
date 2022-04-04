package praktikum;

public class CetakBintang {
    
    public static void main(String args[]) {
        System.out.println("Segitiga bintang bernilai 8\n");
        
        bintang();
    }
    
    public static void bintang() {  
        for (int i = 8; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
