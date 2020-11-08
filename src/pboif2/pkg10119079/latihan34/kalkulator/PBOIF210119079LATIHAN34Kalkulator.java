package pboif2.pkg10119079.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079LATIHAN34Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator menghitung = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        System.out.print("Masukkan Angka ke-1 : ");
        menghitung.value1 = input.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        menghitung.value2 = input.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Pertambahan :" +menghitung.tambahBilangan());
        System.out.println("Hasil Pengurangan :" +menghitung.kurangBilangan());
        System.out.println("Hasil Perkalian :" +menghitung.kaliBilangan());
        System.out.println("Hasil Pembagian :" +menghitung.bagiBilangan());
        System.out.println("Hasil Sisa :" +menghitung.sisaBilangan());
    }
    
}
        