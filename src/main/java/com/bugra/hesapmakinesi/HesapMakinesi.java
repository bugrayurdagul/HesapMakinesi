package com.bugra.hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static double hesapDouble = 0.0;
    public static int hesapInt = 0;
    public static boolean tamamDevam = true;

    public static boolean ilkDeger=true;

    public static boolean islemYapmayaDevamMi = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HesapMakinesi td = new HesapMakinesi();
        while (islemYapmayaDevamMi) {
            td.islemSec();
        }
    }

    //Matematiksel işlemlerin seçiminin bulunduğu fonksiyondur.
    public void islemSec() {
        System.out.print("\nYapılacak işlemi seçiniz: \n 1-Topla \n 2-Çıkar \n 3-Çarp \n 4-Bol \n 5-Kare Al \n 6-Çıkış \n Giriş: ");
        int secenek = sc.nextInt();
        yazdir(secenek);
    }

    public int topla(int... deger) {

        for (int i : deger) {
            hesapInt += i;
        }
        return hesapInt;
    }

    public int cikar(int... deger) {
        //ilkDeger bir boolean değişkendir. İlk değeri true ise kullanıcı ilk defa değer giriyor anlamına gelir.
        //Böylelikle ilk işlemde hesapInt değişkenimizin for içinde negatif bir değer almasını engellemiş oluruz.
        if (ilkDeger){
            hesapInt = deger[0];
            ilkDeger = false;
        }
        else {
            for (int i : deger) {
                hesapInt -= i;
            }
        }

        return hesapInt;
    }

    public int carp(int... deger) {
        for (int i : deger) {
            if (hesapInt != 0.0)
                hesapInt *= i;
            else
                hesapInt = i;
        }
        return hesapInt;
    }

    public double bol(int... deger) {
        for (int i : deger) {
            if (hesapDouble != 0.0)
                hesapDouble /= i;
            else
                hesapDouble = i;
        }
        return hesapDouble;
    }

    public int kareAl(int deger) {
        return deger * deger;
    }

    public void yazdir(int deger) {
        boolean i = true;

        switch (deger) {
            case 1:
                HesapMakinesi toplama = new HesapMakinesi();
                bitir:
                while (tamamDevam) {
                    System.out.print("\nSayı Girin: ");
                    int toplanacakSayi = sc.nextInt();
                    System.out.println("\nToplam = " + toplama.topla(toplanacakSayi));
                    while (true) {
                        System.out.print("\nSayı Girmeye Devam Mı?: (0 = Hayır, 1 = Evet) ");
                        int sayiGirTD = sc.nextInt();
                        if (sayiGirTD == 0) {
                            System.out.println("\nSonucunuz:" + hesapInt);
                            hesapInt = 0;
                            islemSec();
                            break bitir;
                        }
                        else if (sayiGirTD == 1) {
                            break;
                        } else System.out.println("\nLütfen çıkmak için 0 veya devam için 1 giriniz!");
                    }
                }
                //islemSec();
                tamamDevam=false;
                break;
            case 2:
                HesapMakinesi cikarma = new HesapMakinesi();
                bitir:
                while (tamamDevam) {
                    System.out.print("\nSayı Girin: ");
                    int cikarilacakSayi = sc.nextInt();
                    System.out.println("\nÇıkarım = " + cikarma.cikar(cikarilacakSayi));
                    while (true) {
                        System.out.print("\nSayı Girmeye Devam Mı?: (0 = Hayır, 1 = Evet) ");
                        int sayiGirTD = sc.nextInt();
                        if (sayiGirTD == 0) {
                            System.out.println("\nSonucunuz:" + hesapInt);
                            hesapInt = 0;
                            islemSec();
                            break bitir;
                        }
                        else if (sayiGirTD == 1) {
                            break;
                        } else System.out.println("\nLütfen çıkmak için 0 veya devam için 1 giriniz!");
                    }
                }
                break;
            case 3:
                HesapMakinesi carpma = new HesapMakinesi();
                bitir:
                while (tamamDevam) {
                    System.out.print("\nSayı Girin: ");
                    int carpilacakSayi = sc.nextInt();
                    System.out.println("\nÇarpım = " + carpma.carp(carpilacakSayi));
                    while (true) {
                        System.out.print("\nSayı Girmeye Devam Mı?: (0 = Hayır, 1 = Evet) ");
                        int sayiGirTD = sc.nextInt();
                        if (sayiGirTD == 0) {
                            System.out.println("\nSonucunuz:" + hesapInt);
                            hesapInt = 0;
                            islemSec();
                            break bitir;
                        }
                        else if (sayiGirTD == 1) {
                            break;
                        } else System.out.println("\nLütfen çıkmak için 0 veya devam için 1 giriniz!");
                    }
                }
                break;
            case 4:
                HesapMakinesi bolme = new HesapMakinesi();
                bitir:
                while (tamamDevam) {
                    System.out.print("\nSayı Girin: ");
                    int bolunecekSayi = sc.nextInt();
                    System.out.println("\nBölüm = " + (int) bolme.bol(bolunecekSayi));
                    while (true) {
                        System.out.print("\nSayı Girmeye Devam Mı?: (0 = Hayır, 1 = Evet) ");
                        int sayiGirTD = sc.nextInt();
                        if (sayiGirTD == 0) {
                            System.out.println("\nSonucunuz:" + (int) hesapDouble);
                            hesapDouble = 0;
                            islemSec();
                            break bitir;
                        }
                        else if (sayiGirTD == 1) {
                            break;
                        } else System.out.println("\nLütfen çıkmak için 0 veya devam için 1 giriniz!");
                    }
                }
                break;
            case 5:
                HesapMakinesi kareAl = new HesapMakinesi();
                    System.out.print("\nSayı Girin: ");
                    int kareAlinacakSayi = sc.nextInt();
                    System.out.println("\n" + kareAlinacakSayi +" sayisinin karesi = " + kareAl.kareAl(kareAlinacakSayi) +"\n");
                    islemSec();
                    break;

            case 6:
                islemYapmayaDevamMi =false;
                System.out.println("\nProgram başarıyla sonlandırıldı!");
                tamamDevam=false;
                break;
            default:
                System.out.println("\n \n Lütfen Geçerli Bir Seçenek Seçiniz! \n \n");
                break;
        }


    }
}
