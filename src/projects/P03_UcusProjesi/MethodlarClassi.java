package projects.P03_UcusProjesi;

import java.util.Scanner;

public class MethodlarClassi {


   public static double yuzdeElliIndirimYap(String rota, int yon){
     double odenecekUcret=0;
      switch(rota){
         case "B":
            if (yon==1)odenecekUcret=Yolcu.bSehriFiyat/2;
            else if (yon==2)odenecekUcret= (Yolcu.bSehriFiyat/2)*0.8;
            break;
         case "C":
            if (yon==1)odenecekUcret=Yolcu.cSehriFiyat/2;
            else if (yon==2)odenecekUcret= (Yolcu.cSehriFiyat/2)*0.8;
            break;
         case "D":
            if (yon==1)odenecekUcret=Yolcu.dSehriFiyat/2;
            else if (yon==2)odenecekUcret= (Yolcu.dSehriFiyat/2)*0.8;
            break;
      }
  return odenecekUcret; }

public static double yuzdeOnIndirim(String rota,int yon){
   double odenecekUcret=0;
   switch(rota){
      case "B":
         if (yon==1)odenecekUcret=Yolcu.bSehriFiyat*0.9;
         else if (yon==2)odenecekUcret= (Yolcu.bSehriFiyat*0.9)*0.8;
         break;
      case "C":
         if (yon==1)odenecekUcret=Yolcu.cSehriFiyat*0.9;
         else if (yon==2)odenecekUcret= (Yolcu.cSehriFiyat*0.9)*0.8;
         break;
      case "D":
         if (yon==1)odenecekUcret=Yolcu.dSehriFiyat*0.9;
         else if (yon==2)odenecekUcret= (Yolcu.dSehriFiyat*0.9)*0.8;
         break;
   }
   return odenecekUcret;
}
   public static double yuzdeOtuzIndirim(String rota,int yon){
      double odenecekUcret=0;
      switch(rota){
         case "B":
            if (yon==1)odenecekUcret=Yolcu.bSehriFiyat*0.7;
            else if (yon==2)odenecekUcret= (Yolcu.bSehriFiyat*0.7)*0.8;
            break;
         case "C":
            if (yon==1)odenecekUcret=Yolcu.cSehriFiyat*0.7;
            else if (yon==2)odenecekUcret= (Yolcu.cSehriFiyat*0.7)*0.8;
            break;
         case "D":
            if (yon==1)odenecekUcret=Yolcu.dSehriFiyat*0.7;
            else if (yon==2)odenecekUcret= (Yolcu.dSehriFiyat*0.7)*0.8;
            break;
      }
      return odenecekUcret;
   }
   public static double indirimhesapla(int yas){
      double odenecekUcret=0;
      if (yas<0 || yas>130){
         System.out.println("Lutfen gecerli bir yas giriniz!");
      }else {
         if (yas < 12) {
            odenecekUcret = yuzdeElliIndirimYap(Yolcu.rota, Yolcu.yon);
         } else if (yas <= 24) {
            odenecekUcret = yuzdeOnIndirim(Yolcu.rota, Yolcu.yon);
         }else if (yas<=65){
            odenecekUcret=indirimsizFiyat(Yolcu.rota, Yolcu.yon);
         }else if (yas>65){
            odenecekUcret=yuzdeOtuzIndirim(Yolcu.rota, Yolcu.yon);
         }
      }
  return odenecekUcret; }

   public static  double indirimsizFiyat(String rota,int yon) {
      double odenecekUcret = 0;
      switch (rota) {
         case "B":
            if (yon == 1) odenecekUcret = Yolcu.bSehriFiyat;
            else if (yon == 2) odenecekUcret = (Yolcu.bSehriFiyat) * 0.8;
            break;
         case "C":
            if (yon == 1) odenecekUcret = Yolcu.cSehriFiyat;
            else if (yon == 2) odenecekUcret = (Yolcu.cSehriFiyat) * 0.8;
            break;
         case "D":
            if (yon == 1) odenecekUcret = Yolcu.dSehriFiyat;
            else if (yon == 2) odenecekUcret = (Yolcu.dSehriFiyat) * 0.8;
            break;
      }

      return odenecekUcret;

   }
}
