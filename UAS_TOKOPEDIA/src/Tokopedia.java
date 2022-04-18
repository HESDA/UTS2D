// Nama: Mochammad Febrian Maulana Hesda
// NIM: 21090060
// Kelas: 2D


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import Model.MTokped;

public class Tokopedia {
    public static void main(String args[])
    {
        //Inisialisasi objek untuk masing-masing kelas
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        //Deklarasi variabel
        int jum=0, i=0;
        double total_bayar=0;
        //Deklarasi array
        int [] kode = new int[5];
        int [] qty = new int[5];
        int [] Harga = new int[5];
        double [] sub_total = new double[5];
        double [] diskon= new double [5];
        String [] barang = new String[5];

        System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");

        System.out.print("Masukan Jumlah Beli : ");
        jum=input.nextInt();
        System.out.println(" ");
        //Memasukan elemen didalam array
        for (i=0; i<jum;i++){
            System.out.print("Masukan Kode Barang Ke-"+(i+1)+" : ");
            kode[i]=input.nextInt();
            System.out.print("Masukan qty Ke-"+(i+1)+" : ");
            qty[i]=input.nextInt();
            //Menentukan barang berdasarkan kode yang dimmasukan
            switch (kode[i]){
                case 1 :
                    barang[i]=" Laptop  ";
                    Harga[i]=149999;
                    diskon[i]=0.1;
                    break;
                case 2 :
                    barang[i]="Kerudung ";
                    Harga[i]=246000;
                    diskon[i]=0.05;
                    break;
                case 3 :
                    barang[i]="Power Bank  ";
                    Harga[i]=136000;
                    diskon[i]=0;
                    break;
                case 4 :
                    barang[i]="Kamera        ";
                    Harga[i]=267999;
                    diskon[i]=0.2;
                    break;
                case 5 :
                    barang[i]="Smart Watch    ";
                    Harga[i]=899000;
                    diskon[i]=0.1;
                    break;
                default :
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }
        //Pengaturan format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("No   Nama Barang             Harga            QTY  Diskon   Sub Total");
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jum;i++){
            sub_total[i]=((qty[i]*Harga[i])-(qty[i]*Harga[i]*diskon[i]));
            total_bayar+=sub_total[i];
            System.out.println(i+1+"    "+barang[i]+"   "+kursIndonesia.format(Harga[i])+"    "+qty[i]+"     "+(int)(diskon[i]*100)+"%"+"     "+kursIndonesia.format(sub_total[i]));
        }
        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
    }
}