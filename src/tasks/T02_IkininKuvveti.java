package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        double num=scan.nextDouble();

        PowersofTwo(num);

    }

    private static void PowersofTwo(double num) {//2,4,8,16,32,
        List<Double> ikininKuvvetleri = new ArrayList<>();
        for (int i = 1; i < num; i++) {

                ikininKuvvetleri.add(Math.pow(2,i));
            }
       if (ikininKuvvetleri.contains(num)){
           System.out.println(num+" 2'nin kuvveti olan bir sayidir");
       }else System.out.println(num+" 2'nin kuvveti olan bir sayi degildir");
        }




    }

