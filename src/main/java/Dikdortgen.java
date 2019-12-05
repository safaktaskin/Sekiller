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

/**
 * Dikdortgen
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class Dikdortgen extends Daire {

    private int dikdortgenCevresi;
    private int yukseklik;
    private int genislik;

    public int getDikdortgenCevresi() {
        return dikdortgenCevresi;
    }

    public void setDikdortgenCevresi(int dikdortgenCevresi) {
        this.dikdortgenCevresi = dikdortgenCevresi;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }


    public void alanHesaplanir() {

    }

    @Override
    public int cevreHesapla(int sayi1, int sayi2) {
        int sonuc = sayi1 * 2 + sayi2 * 2;

        return sonuc;
    }
}
