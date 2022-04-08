package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        StringBuilder reverseCumle=new StringBuilder(cumle);
        reverseCumle.reverse();

        if (reverseCumle.toString().equalsIgnoreCase(cumle)){
            System.out.println(reverseCumle);
            System.out.println("Girdiginiz cumle palindrome'dur");
        }else{
            System.out.println(reverseCumle);
            System.out.println("Girdiginiz cumle palindrome degildir");
        }




    }

}
