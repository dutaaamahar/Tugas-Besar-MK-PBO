package praktikum;

public class modul_8 {

    public static void main(String args[]) {
        // Deklarasi array 2 dimensi
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Cetak array 2 dimensi per indeks
        System.out.println("Array indeks [0][0] adalah " + data[0][0]);
        System.out.println("Array indeks [1][1] adalah " + data[1][1]);
        System.out.println("Array indeks [2][2] adalah " + data[2][2]);
        
        // Cetak array 2 dimensi menggunakan perulangan
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
