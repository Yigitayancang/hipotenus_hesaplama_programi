// kullanıcı verisi almak için kütüphane eklenimi
import java.util.Scanner;
public class hipotenus_hesaplama {

    public static void main(String[] args) {
        // kullanıcı verilerini tutmak için int ve double türünde verip tipi tanımı     
        int a , b;
        double c ;
        //kullanıcıdan veri alma 
        Scanner giris = new Scanner(System.in);
        System.out.println("1. KENARI GİRİNİZ : ");
        a =giris.nextInt();
        System.out.println("İKİNCİ KENARI GİRİNİZ : ");
        b = giris.nextInt();
        // kullanıcıdan alınan verilerin hesaplanıp ekrana bastırma. 
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " +  c);
    }
    
    
}