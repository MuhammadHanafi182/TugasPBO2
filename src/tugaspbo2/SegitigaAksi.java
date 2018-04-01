package tugaspbo2;

public class SegitigaAksi {
    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        s1.alas = 17;
        s1.tinggi = 22;
        
        s1.cetakinfo();
        System.out.println("Luas Segitiga ="+s1.hitungluas());
        s1.cetakluas();
        
        Segitiga s2 = new Segitiga();
        s2.cetakinfo();
        
        Segitiga s3 = new Segitiga(25,40);
        s3.cetakinfo();
    }
    
}
