import java.util.Scanner;
import java.util.function.IntPredicate;
public class main {
    public static void main(String[] args) {
        
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Sınav Puanını Giriniz:");
        mat = input.nextInt();

        System.out.println("Fizik Sınav Puanını Giriniz:");
        fizik = input.nextInt();

        System.out.println("Kimya Sınav Puanını Giriniz:");
        kimya = input.nextInt();

        System.out.println("Türkçe Sınav Puanını Giriniz:");
        turkce = input.nextInt();

        System.out.println("Tarih Sınav Puanını Giriniz:");
        tarih = input.nextInt();

        System.out.println("Müzik Sınav Puanını Giriniz:");
        muzik = input.nextInt();

        int toplam = mat + fizik + tarih + turkce + muzik + kimya;
        double sonuc = toplam / 6.0 ;
        boolean sonuc2 = (sonuc>=60);
        String info = sonuc2 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Öğrencinin Ortalaması: "+sonuc+" Durumu:"+info);
    
    }
}
