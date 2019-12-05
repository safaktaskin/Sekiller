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
 * Ucgen
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class Ucgen extends Sekil {

    private int yukseklik;
    private int kenarUzunluklari;
    private int taban;

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getKenarUzunluklari() {
        return kenarUzunluklari;
    }

    public void setKenarUzunluklari(int kenarUzunluklari) {
        this.kenarUzunluklari = kenarUzunluklari;
    }

    @Override
    public double alanHesapla(double sayi1, double sayi2) {
        double ucgeninAlani = sayi1 * sayi2;
        return ucgeninAlani;
    }

    @Override
    public int cevreHesapla(int sayi1) {
        int ucgenCevreSonuc = sayi1 * 3;

        return ucgenCevreSonuc;
    }
}
