package com.ferhat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sayi1;
        int sayi2;
        int secim;
        String islem;
        int sonuc;

        String ikilik1;
        String ikilik2;

        System.out.println("Yapmak istediğiniz islem türünü seçiniz");
        System.out.println("1 -> Matematiksel İşlemler");
        System.out.println("2 -> Mantıksal İşlemsel");

        secim = s.nextInt();

        //Matematiksel İşlemler
        if (secim == 1){

            System.out.println("İlk sayıyı giriniz");
            sayi1 = s.nextInt();

            System.out.println("İkinci sayıyı giriniz");
            sayi2 = s.nextInt();


            System.out.println("Yapmak istediğiniz işlem türünü seçiniz");
            System.out.println("Toplama -> + , Çıkartma -> - , Çarpma -> * , Bölme -> /");
            islem = s.next();

            switch (islem) {
                case "+":
                    sonuc = sayi1 + sayi2;
                    System.out.println("İslem sonucu onluk tabanda = " + sonuc);
                    System.out.println("İslem sonucu ikilik tabanda = " + Integer.toString(sonuc, 2));
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    System.out.println("İslem sonucu onluk tabanda = " + sonuc);
                    System.out.println("İslem sonucu ikilik tabanda = " + Integer.toString(sonuc, 2));
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    System.out.println("İslem sonucu onluk tabanda = " + sonuc);
                    System.out.println("İslem sonucu ikilik tabanda = " + Integer.toString(sonuc, 2));
                    break;
                case "/":
                    sonuc = sayi1 / sayi2;
                    System.out.println("İslem sonucu onluk tabanda = " + sonuc);
                    System.out.println("İslem sonucu ikilik tabanda = " + Integer.toString(sonuc, 2));
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz");
                    break;
            }
        }

        //Mantıksal İşlemler
        else if (secim == 2){
            System.out.println("İkilik tabanda ilk sayıyı giriniz");
            ikilik1 = s.next();
            System.out.println("İkilik tabanda ikinci sayıyı giriniz");
            ikilik2 = s.next();


            if (ikilik1.length() != 4 || ikilik2.length() !=4){
                System.out.println("İkilik tabanda girdiğiniz sayıları lütfen 4 basamaklı olarak giriniz");
            }

            /*
            else if (){
              TODO ikilikten gelen 01 lerin 01 olduğunu kontrol et
            }
            */

            else{
                int IntIkilik1 = Integer.valueOf(ikilik1, 2);
                int IntIkilik2 = Integer.valueOf(ikilik2, 2);

                System.out.println("Yapmak istediğiniz işlemi belirtiniz (AND, OR, XOR, XNOR, Number1' , Number2')");
                islem = s.next();
                islem = islem.toUpperCase().trim();

                String ikilikSonuc;

                switch (islem) {
                    case "AND":
                        sonuc = (IntIkilik1 & IntIkilik2);
                        ikilikSonuc = Integer.toString(sonuc, 2);
                        System.out.println("Sonuç : " + ikilikSonuc);
                        break;

                    case "OR":
                        sonuc = (IntIkilik1 | IntIkilik2);
                        ikilikSonuc = Integer.toString(sonuc, 2);
                        System.out.println("Sonuç : " + ikilikSonuc);
                        break;

                    case "XOR":
                        sonuc = (IntIkilik1 ^ IntIkilik2);
                        ikilikSonuc = Integer.toString(sonuc, 2);
                        System.out.println("Sonuç : " + ikilikSonuc);
                        break;

                    case "XNOR":
                        sonuc = (IntIkilik1 ^ IntIkilik2);
                        System.out.println(Integer.toBinaryString(~sonuc).substring(28));
                        break;

                    case "NUMBER1'":
                        System.out.println(Integer.toBinaryString(~IntIkilik1).substring(28));
                        break;

                    case "NUMBER2'":
                        System.out.println(Integer.toBinaryString(~IntIkilik2).substring(28));
                        break;

                    default:
                        System.out.println("Geçerli bir işlem giriniz");
                        break;
                }
            }

        }
        //Hata
        else {
            System.out.println("Yapmak istediğiniz işlemi 1 veya 2 ile seçiniz");
        }



    }
}
