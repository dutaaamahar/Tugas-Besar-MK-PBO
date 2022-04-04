package praktikum;

class Pegawai {
    
    public int nip,npp;
    
    public void data(int nip, int npp) {
        this.nip = nip;
        this.npp = npp;
    }
    
    int getNip() {
        return nip;
    }
    
    int getNpp() {
        return npp;
    }
    
    public void tampil() {
        System.out.println(" Data NIP : " + nip);
        System.out.println(" Data NPP : " + npp);
    }
}

class manager extends Pegawai {
    
    protected String nama_manager,alamat;
    protected int umur;
    
    public void datam(String nama_manager, String alamat, int umur, int n1, int n2) {
        this.alamat = alamat;
        this.nama_manager = nama_manager;
        this.umur = umur;
        
        super.data(n1, n2);
    }

    String getNama_manager() {
        return nama_manager;
    }
    
    String getAlamat() {
        return alamat;
    }
    
    int getUmur() {
        return umur;
    }

    public void tampil() {
        System.out.println(" 1. No Induk Pegawai : " + nip);
        System.out.println(" 2. No Pokok Pegawai : " + npp);
    }
}

class supervisor extends manager {
    
    String nama_supervisor;
    
    public void datas(String nama_supervisor , String alamat, int umur, int n1, int n2) {
        this.nama_supervisor = nama_supervisor;
        
        super.datam(nama_manager, alamat, umur, n1, n2);
        super.data(n1, n2);
    }

    String getNama_supervisor(){
        return nama_supervisor;
    }

    public void tampil() {
        System.out.println(" Data Supervisor ");
        System.out.println("-----------------");
        
        super.tampil();
        
        System.out.println(" 3. Nama    : " + nama_supervisor);
        System.out.println(" 4. Alamat  : " + alamat);
        System.out.println(" 5. Umur    : " + umur);
    }
}

public class Inheritance {
    public static void main(String[] args) {
    
        Pegawai baru = new Pegawai();
        manager m1 = new manager();
        supervisor s1 = new supervisor();

        baru.nip = 2013131;
        baru.npp = 1313;

        m1.datam(" Van Travis "," Pamulang ", 20, baru.nip, baru.npp);
        s1.datas(" Sinta Indah "," Bogor ", 18, baru.nip, baru.npp);
        
        System.out.println(" Data Manager ");
        System.out.println("-----------------");
        
        m1.tampil();
        
        System.out.println(" 3. Nama    : " + m1.nama_manager);
        System.out.println(" 4. Alamat  : " + m1.alamat);
        System.out.println(" 5. Umur    : " + m1.umur);
        
        s1.tampil();
    }
}
