import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz:");
        muzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        float ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }

}
