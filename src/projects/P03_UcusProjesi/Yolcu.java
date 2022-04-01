package projects.P03_UcusProjesi;

public class Yolcu {

    static double bSehriFiyat=0.10*500;
    static double cSehriFiyat=0.10*700;
    static double dSehriFiyat=0.10*900;
    static String rota;
    int yas;
    static int yon;

    public Yolcu(String rota, int yas, int yon) {
        this.rota = rota;
        this.yas = yas;
        this.yon = yon;
    }
}
