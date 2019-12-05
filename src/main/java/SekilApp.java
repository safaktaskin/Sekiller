/*
 * Copyright 2019 Universal Bilgi Teknolojileri.
 *
 * UKL 1.1 lisansı ile lisanslanmıştır. Bu dosyanın l,isans koşullarına uygun
 * olmayan şekilde kullanımı yasaklanmıştır. Lisansın bir kopyasını aşağıdaki
 * linkten edinebilirsiniz.
 *
 * http://www.uni-yaz.com/lisans/ukl_1_1.pdf
 *
 * Yasalar aksini söylemediği veya yazılı bir sözleşme ile aksi belirtilmediği sürece,
 * bu yazılım mevcut hali ile hiç bir garanti vermeden veya herhangi bir şart ileri
 * sürmeden dağıtılır. Bu yazılımın edinim izinleri ve limitler konusunda lisans
 * sözleşmesine bakınız.
 *
 */

import java.util.Scanner;

/**
 * SekilApp
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class SekilApp {
    public static void main(String[] args) {
        Sekil sekil = new Ucgen();
        Sekil sekil1 = new Daire();
        Sekil sekil2 = new Dikdortgen();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Üçgen");
            System.out.println("2. Daire");
            System.out.println("3. Dikdörtgen");
            System.out.println("Seçiminiz:");

            int secim = scanner.nextInt();
            if (secim == 1) {
                scanner.nextLine();
                System.out.println("1.Alan Hesapla");
                System.out.println("2.Çevre Hesapla");
                System.out.println("Seçiminiz: ");
                int sonuc = scanner.nextInt();
                Ucgen ucgen = new Ucgen();
                if (sonuc == 1) {
                    System.out.println("Taban değerini giriniz: ");
                    double tabanDegeri = scanner.nextInt();
                    System.out.println("Yükseklik değerini giriniz: ");
                    double yukseklikDegeri = scanner.nextInt();
                    double ucgenAlanSsonuc = sekil.alanHesapla(yukseklikDegeri, tabanDegeri);
                    System.out.println(ucgenAlanSsonuc);
                } else if (sonuc == 2) {
                    System.out.println("Kenar Uzunlukları Girin");
                    int kenarUzunlugu = scanner.nextInt();
                    int sonucCevre = sekil.cevreHesapla(kenarUzunlugu);
                    System.out.println(sonucCevre);
                }
            } else if (secim == 2) {
                System.out.println("1.Alan Hesapla");
                System.out.println("2.Çevre Hesapla");
                System.out.println("Seçiminiz: ");
                int sonuc = scanner.nextInt();
                if (sonuc == 1) {
                    Daire daire = new Daire();
                    System.out.println("Yarıçapını giriniz: ");
                    int yaricap = scanner.nextInt();
                    double sonucuOlustur = sekil1.alanHesapla(yaricap);
                    System.out.println(sonucuOlustur);
                } else if (sonuc == 2) {
                }
            }
             else if (secim == 3) {
                System.out.println("1.Çevre Hesapla");
                System.out.println("2.Alan Hesapla");
                System.out.println("Seçiminiz: ");
                scanner.nextLine();
                if (secim == 1) {
                    System.out.println("Uzunluk Giriniz");
                    int uzunlukDegeri = scanner.nextInt();
                    System.out.println("Yükseklik Giriniz");
                    int yukseklikDegeri = scanner.nextInt();
                    int dikdortgenSonuc = sekil2.cevreHesapla(uzunlukDegeri, yukseklikDegeri);
                    System.out.println(dikdortgenSonuc);
                }
                else if (secim == 2){}


        } else

    {
        break;
    }

}
        while(true);


                }

                }



























