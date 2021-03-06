import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleriBastir(){

        System.out.println("***********************************");
        System.out.println("\t SARKICI UYGULAMASINA HOSGELDINIZ....");
        System.out.println("\t 0-Islemleri Goruntule");
        System.out.println("\t 1-Sarkicilari Goruntule");
        System.out.println("\t 2-Sarkici Ekle");
        System.out.println("\t 3-Sarkici Guncelle");
        System.out.println("\t 4-Sarkici Sil");
        System.out.println("\t 5-Sarkici Ara");
        System.out.println("\t 6-Uygulamadan Cik");
        System.out.println("***********************************");
    }

    public static void sarkiciGoruntule(){
        sarkicilar.sarkicilariBastir();
    }

    public static void sarkiciEkle(){
        System.out.println("Eklemek istediginiz sarkici ismi giriniz : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }

    public static void sarkiciGuncelle(){

        System.out.println("Sarkicinin pozisyonunu giriniz: ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni isim giriniz: ");
        String isimYeni = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(isimYeni, (pozisyon-1));
    }

    public static void sarkiciSil(){
        System.out.println("Silmek istediginiz sarkici pozisyonu giriniz : ");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkiciSil((pozisyon-1));
    }

    public static void sarkiciAra (){
        System.out.println("Aramak istediginiz sarkici ismi giriniz : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
    }

    public static void main(String[] args) {

        islemleriBastir();

        boolean cikis = false;
        int islem;

        while (!cikis){
            System.out.println("Bir islem seciniz : ");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0 :
                    islemleriBastir();
                    break;
                case 1 :
                    sarkiciGoruntule ();
                    break;
                case 2 :
                    sarkiciEkle();
                    break;
                case 3 :
                    sarkiciGuncelle();
                    break;
                case 4 :
                    sarkiciSil();
                    break;
                case 5 :
                    sarkiciAra ();
                    break;
                case 6 :
                    cikis = true;
                    System.out.println("Uygulamadan Cikiliyor...");
                    break;
            }
        }
    }
}
