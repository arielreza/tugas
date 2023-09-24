import java.util.Scanner;

public class HargaBayar18 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int harga, jumlah, jmlHal;
    double total, bayar, jmlDis, diskon;
    String merkBuku;

    System.out.println("Masukkan Merk Buku");
    merkBuku=input.next();
    System.out.println("Masukkan Jumlah halaman buku");
    jmlHal=input.nextInt();
    System.out.println("Masukkan Besaran Diskon (dalam persen)");
    jmlDis=input.nextDouble();
    System.out.println("Masukkan harga barang yang dibeli ");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah barang yang dibeli ");
    jumlah=input.nextInt();

    total=harga*jumlah;
    diskon= (jmlDis/100)*total;
    bayar=total-diskon;

    System.out.println("Diskon yang anda dapatkan adalah " +jmlDis + "%");
    System.out.println("Jumlah yang harus dibayar adalah " +bayar);

    input.close();
 }   
}
