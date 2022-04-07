package P06_KahveMakinesi.Kahve_mqkinesi01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangiKahve extends Kahve {

    public static void kahveTuru() {

    }

    public static void sutEkle() throws InterruptedException {
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        setSut(scan.nextLine());
        if (getSut().equalsIgnoreCase("Evet")) {
            System.out.println("Sut ekleniyor...");
            sekerEkle();
        } else if (getSut().equalsIgnoreCase("Hayir")) {
            System.out.println("Sut eklenmiyor");
            sekerEkle();
        } else {
            System.out.println("Hatali tuslama yaptiniz!...\nLutfen tekrar deneyiniz.");
            sutEkle();
        }

    }

    public static void sekerEkle() throws InterruptedException {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        setSeker(scan.nextLine());
        if (getSeker().equalsIgnoreCase("Evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = scan.nextInt();
            System.out.println(kacSeker + " seker ekleniyor...");
            scan.nextLine();
            boyutSec();
        } else if (getSeker().equalsIgnoreCase("Hayir")) {
            System.out.println("Seker eklenmiyor");
            boyutSec();
        }else {
            System.out.println("Hatali tuslama yaptiniz!...\nLutfen tekrar deneyiniz.");
            sekerEkle();
        }


    }

    public static void boyutSec() throws InterruptedException {
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
        setBoyut(scan.nextLine());
        if (getBoyut().equalsIgnoreCase("Buyuk boy")){
            System.out.println("Kahveniz "+getBoyut()+" olarak hazirlaniyor");
            Thread.sleep(3000);
            sonucYazdir();
        }else if (getBoyut().equalsIgnoreCase("Kucuk boy")) {
            System.out.println("Kahveniz " + getBoyut() + " olarak hazirlaniyor");
            Thread.sleep(3000);
            sonucYazdir();
        }else if (getBoyut().equalsIgnoreCase("Orta boy")) {
            System.out.println("Kahveniz " + getBoyut() + " olarak hazirlaniyor");
            Thread.sleep(3000);
            sonucYazdir();
        }else {
            System.out.println("Hatali tuslama yaptiniz!...\nLutfen tekrar deneyiniz.");
            boyutSec();
        }

    }

    public static void giris() throws InterruptedException {
        System.out.println("****** HOS GELDINIZ ******");
        System.out.println("Hangi kahveyi istersiniz?\n1.Turk Kahvesi\n2.Filtre Kahve\n3.Espresso");
        setHangiKahve(scan.nextLine());
        if (getHangiKahve().equalsIgnoreCase("Turk Kahvesi")) {
            System.out.println(getHangiKahve() + " hazirlaniyor");
            sutEkle();
        } else if (getHangiKahve().equalsIgnoreCase("Filtre Kahve")) {
            System.out.println(getHangiKahve() + " hazirlaniyor");
            sutEkle();
        } else if (getHangiKahve().equalsIgnoreCase("Espresso")) {
            System.out.println(getHangiKahve() + " hazirlaniyor");
            sutEkle();

        } else {
            System.out.println("Hatali tuslama yaptiniz!...\nLutfen tekrar deneyiniz.");
            giris();
        }
    }
    public static  void sonucYazdir(){
        System.out.println(getHangiKahve()+" "+getBoyut()+" hazirdir.\nAfiyet olsun... Yine bekleriz...");
    }
}