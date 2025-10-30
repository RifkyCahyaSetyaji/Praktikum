package PraktikumMethod;

import java.util.Scanner;

public class Modul5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean kondisi = true;
        int n = 0;
        int r = 0;

        while (kondisi == true) {
            System.out.println();
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai n: ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai r: ");
                    r = sc.nextInt();
                    int hasilp=0;
                    int fnp=Faktorialn(n);
                    int fnrp=Faktorialnr(n,r);
                    hasilp=fnp/fnrp;
                    //Permutasi(n, r);
                    System.out.println("Maka Hasil Permutasinya adalah: " + hasilp);
                    break;
                case 2:
                    System.out.print("Masukkan nilai n: ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai r: ");
                    r = sc.nextInt();
                    int hasilk=0;
                    int fnk=Faktorialn(n);
                    int frk=Faktorialn(r);
                    int fnrk=Faktorialnr(n,r);
                    hasilk=fnk/(fnrk*frk);
                    System.out.println("Maka Hasil Kombinasinya adalah: " + hasilk);
                    //Kombinasi(n, r);
                    break;
                case 3:
                    kondisi=false;
                    break;
                default:
                    System.out.println("Inputan Tidak Ada");
                    break;
            }
        }
    }
    static int Faktorialn(int n){
        if(n==1){
            return 1;
        }else{
            return n*Faktorialn(n-1);
        }
    }
    static int Faktorialnr(int n,int r){
        int nr=n-r;
        if(nr==1){
            return 1;
        }else{
            return nr*Faktorialn(nr-1);
        }
    }
    public static void Permutasi(int n, int r) {
        int faktorial = 0;
        int hasil = 0;
        int nf = 1;
        int nrf = 1;
        int rf = 1;
        faktorial = n - r;
        for (int i = 1; i <= n; i++) {
            nf *= i;
        }
        for (int i = 1; i <= faktorial; i++) {
            nrf *= i;
        }
        for (int i = 1; i <= r; i++) {
            rf *= i;
        }
        hasil = nf / (nrf);
        System.out.println("Maka Hasil Permutasinya adalah: " + hasil);
    }

    public static void Kombinasi(int n, int r) {
        int faktorial = 0;
        int hasil = 0;
        int nf = 1;
        int nrf = 1;
        int rf = 1;
        faktorial = n - r;
        for (int i = 1; i <= n; i++) {
            nf *= i;
        }
        for (int i = 1; i <= faktorial; i++) {
            nrf *= i;
        }
        for (int i = 1; i <= r; i++) {
            rf *= i;
        }
        hasil = nf / (nrf * rf);
        System.out.println("Maka Hasil Kombinasinya adalah: " + hasil);
    }
}
