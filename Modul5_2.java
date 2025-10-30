package PraktikumMethod;

import java.util.Scanner;

public class Modul5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batas = 100;

        System.out.print("masukkan bilangan prima: ");
        int nilai = sc.nextInt();
        Prima(nilai);
        System.out.println("program menentukan bilangan prima 1-100");
        UrutPrima(batas);
    }

    public static void Prima(int nilai) {
        boolean prima = true;
        if (nilai >= 1 && nilai <= 100) {
            if (nilai <= 1) {
                prima = false;
            } else {
                for (int i = 2; i <= Math.sqrt(nilai); i++) {
                    if (nilai % i == 0) {
                        prima = false;
                        break;
                    }
                }
            }

            if (prima) {
                System.out.println("bilangan " + nilai + " termasuk bilangan prima");
            } else {
                System.out.println("bilangan " + nilai + " termasuk bukan bilangan prima");
            }
        } else {
            System.out.println("Bilangan tidak termasuk dalam 1-100");
        }
    }

    public static void UrutPrima(int batas) {
        for (int i = 0; i <= 100; i++) {
            boolean prima = true;
            if (i <= 1) {
                prima = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prima = false;
                        break;
                    }
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
