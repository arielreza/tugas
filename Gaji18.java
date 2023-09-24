import java.util.Scanner;

public class Gaji18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, Gaji, PotGaji;
        
        System.out.println("Masukkan Jumlah Besaran Gaji ");
        Gaji=input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji");
        PotGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();

        TotGaji=(jmlMasuk*Gaji)-(JmlTdkMasuk*PotGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

        input.close();
    }
}
