package tugaspbo2;
public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga() {
        alas=9;
        tinggi=14;
    }
    
    void cetakinfo(){
        System.out.println("=========================");
        System.out.println("Alas   :"+alas);
        System.out.println("Tinggi :"+tinggi);
        System.out.println("=========================");
    }
    
    double hitungluas(){
        double luas;
        luas=(alas*tinggi)/2;
        return luas;
    }
    void cetakluas(){
        System.out.println("Luas Segitiga adalah :"+hitungluas());
    }
}
