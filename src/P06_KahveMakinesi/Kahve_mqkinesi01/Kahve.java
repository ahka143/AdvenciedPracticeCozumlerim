package P06_KahveMakinesi.Kahve_mqkinesi01;

import java.util.Scanner;

public class Kahve {
public static Scanner scan = new Scanner(System.in);
    private static String hangiKahve;
    private static String sut;
    private static String seker;

    public static String getHangiKahve() {
        return hangiKahve;
    }

    public static void setHangiKahve(String hangiKahve) {
        Kahve.hangiKahve = hangiKahve;
    }

    public static String getSut() {
        return sut;
    }

    public static void setSut(String sut) {
        Kahve.sut = sut;
    }

    public static String getSeker() {
        return seker;
    }

    public static void setSeker(String seker) {
        Kahve.seker = seker;
    }

    public static String getBoyut() {
        return boyut;
    }

    public static void setBoyut(String boyut) {
        Kahve.boyut = boyut;
    }

    private static String boyut;


}
