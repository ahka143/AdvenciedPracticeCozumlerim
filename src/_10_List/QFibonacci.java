package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
    // 0,1,2,3,4,5,6,7,8

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int fib = 0;

        int i=1;
        while (fibonacci.get(fibonacci.size()-1)<=sayi) {

            fib=fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2);
            fibonacci.add(fib);
            fib+=i;
            i++;

        }

        if (fibonacci.get(fibonacci.size()-1)>sayi){
            fibonacci.remove(fibonacci.size()-1);
        }

        System.out.println(fibonacci);
    }
}
