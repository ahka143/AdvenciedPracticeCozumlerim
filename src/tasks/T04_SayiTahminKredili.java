package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {
    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */
        Random rnd = new Random();
        int rastgeleSayi = rnd.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int tahmin=0;
        do {
            System.out.println("Lutfen bir sayi giriniz: ");
            tahmin=scan.nextInt();
            if (tahmin>rastgeleSayi){
                System.out.println("Soylediginden daha kucuk bir sayi");
            }else if(tahmin<rastgeleSayi) System.out.println("Soylediginden daha buyuk bir sayi");


        }while(tahmin!=rastgeleSayi);

        System.out.println("Tebrikler tuttugum sayiyi buldun.  "+ rastgeleSayi);


    }
}
