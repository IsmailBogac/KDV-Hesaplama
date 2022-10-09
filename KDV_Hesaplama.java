import   java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar,kdvOran=0.18,kdvOran2=0.08,kdvliFiyat,kdvtutar,kdvliFiyat2;
        // Kullanıcıdan veriyi aldım
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz:");
        tutar= input.nextDouble();

         // Tutar 1000 tl nin üstündeyse KDV oranı 0.08 dir.
        if (tutar >=1000) {
            kdvtutar=tutar*kdvOran2;
            kdvliFiyat = tutar+kdvtutar;
            System.out.println("KDV siz fiyat :"+tutar);
            System.out.println("KDV oranı :"+ kdvOran2);
            System.out.println("KDV tutarı :"+kdvtutar);
            System.out.println("KDV li fiyat :" + kdvliFiyat);

        }
        // Tutar 1000 tl nin altındaysa KDV oranı 0.18 dir.
        else {
            kdvtutar=tutar*kdvOran2;
            kdvliFiyat2=tutar+kdvtutar;
            System.out.println("KDV siz fiyat :"+tutar);
            System.out.println("KDV oranı :"+kdvOran);
            System.out.println("KDV tutarı :"+ kdvtutar);
            System.out.println("KDV li fiyat :" + kdvliFiyat2);

        }



    }




}


