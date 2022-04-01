package projects.P03_UcusProjesi;

import java.util.Scanner;

public class JavaAirlines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gitmek istediginiz sehri giriniz: B , C, D");
        String rota= scan.next().toUpperCase();
        System.out.println("Biletiniz tek yon mu yoksa cift yon mu? Tek icin 1, cift icin 2");
        int yon=scan.nextInt();
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        Yolcu yolcu1= new Yolcu(rota,yas,yon);
        System.out.println("Odemeniz gereken ucret = " + MethodlarClassi.indirimhesapla(yas));


    }
}
