
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan nilai n:");
        int n=sc.nextInt();
        if (n%3==0){
            if (n%7==0){
                System.out.println("Kwek Bareng Cruesh");
            } else{
                System.out.println("Kwek Lagi Sendiri");
            }
        }else if (n%7==0) {
            System.out.println("Cruesh Lagi Sendiri");
        } else {
            System.out.println("Bilangan n tidak memenuhi aturan diatas" );
            }
        }
    }
