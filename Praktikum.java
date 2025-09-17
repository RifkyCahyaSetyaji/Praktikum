import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Regular=50000;
        int D=75000;
        int IMAX=100000;
        int disRegular=0;
        int disD=0;
        int disIMAX=0;
        int total=0;
        int dis=0;
        int harga=0;
        String jenisFilm="";
        System.out.print("Masukkan umur Anda: ");
        int umur=sc.nextInt();
        System.out.print("jumlah tiket yang ingin dibeli:");
        int jumlah=sc.nextInt();

        if (umur<12){
            disRegular=50;
            disD=50;
            disIMAX=40;
        } else if (umur>=12 && umur<=60) {
            disRegular=0;
            disD=0;
            disIMAX=0;
        } else {
            disRegular=30;
            disD=30;
            disIMAX=20;
        }
        System.out.println("Masukkan jenis film yang akan ditonton:");
        System.out.println("1: Regular");
        System.out.println("2: 3D");
        System.out.println("3: IMAX");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan=sc.nextInt();

        switch (pilihan) {
            case 1:
            jenisFilm="Regular";
            dis=disRegular;
            harga=Regular;
            total=(Regular*jumlah)*(100-disRegular)/100;
                break;
            case 2:
            jenisFilm="3D";
            dis=disD;
            harga=D;
            total=(D*jumlah)*(100-disD)/100;
                break;
            case 3:
            jenisFilm="IMAX";
            dis=disIMAX;
            harga=IMAX;
            total=(IMAX*jumlah)*(100-disIMAX)/100;
                break;
            default:
                break;
        }
            System.out.println("--- Rincian Pembayaran ---");
            System.out.println("Jenis Film: "+ jenisFilm);
            System.out.println("Jumlah Tiket: "+jumlah);
            System.out.println("Harga per Tiket: Rp "+ harga);
            System.out.println("Diskon: "+dis+"%");
            System.out.println("Total yang harus dibayar: Rp "+total);

        }
    }
