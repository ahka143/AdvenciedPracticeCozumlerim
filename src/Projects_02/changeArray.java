package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {


        String arr[]={"Peach" , "Berry" , "Orange" , "WaterMelon" , "Orange"};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals("Orange")){
                arr[i]="Apple";
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}