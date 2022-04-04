package praktikum;

class A {
    
    private int a;
    
    public void setA(int nilai) {
        a = nilai;
    }
    
    public int getA() {
        return a;
    }
}

class B extends A {
            
    private int b;
    
    public void setB(int nilai) {
        b = nilai;
    }
    
    public int getB() {
        return b;
    }
}

class DemoPewarisan {

    public static void main(String args[]) {
        B obj = new B();
        obj.setA(30);
        obj.setB(20);
        
        System.out.println("Nilai A = " + obj.getA());
        System.out.println("Nilai B = " + obj.getB());
    }
}   
