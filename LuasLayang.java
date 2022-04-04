//Nama  = Dwi Duta Mahardewantoro
//NIM   = 20200410700071

package praktikum;

class X {
    
    private double x;
    
    public void setX(double nilai) {
        x = nilai;
    }
    
    public double getX() {
        return x;
    }
}

class Y extends X {
    
    private double y;
    
    public void setY(double nilai) {
        y = nilai;
    }
    
    public double getY() {
        return (int) y;
    }
}

public class LuasLayang {

    public static void main(String args[]) {
        double luas;
        
        Y diagonal = new Y();
        diagonal.setX(5);
        diagonal.setY(5);
        luas = diagonal.getX() * diagonal.getY() / 2;
        
        System.out.println("Diagonal ke-1 = " + diagonal.getX());
        System.out.println("Diagonal ke-2 = " + diagonal.getY());
        System.out.println("Luas Layang-layang = " + luas);
    }
}
