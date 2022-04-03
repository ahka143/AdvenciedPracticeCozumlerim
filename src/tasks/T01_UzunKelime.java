package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class T01_UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");

        String cumle[] = scan.nextLine().trim().split(" ");
        LongestWord(cumle);




    }

    private static String LongestWord(String[] cumle) {
        String uzunKelime="";

        for (String each:cumle
             ) {
            if (each.length()>uzunKelime.length()){
                uzunKelime=each;
            }
        }

        System.out.println("Girdiginiz cumlenin en uzun kelimesi \" "+uzunKelime+" \" kelimesidir");
    return uzunKelime;}
}