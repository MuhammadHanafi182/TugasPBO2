package tugaspbo2;
public class Segitiga {
    double alas;
    double tinggi;
    
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
}
