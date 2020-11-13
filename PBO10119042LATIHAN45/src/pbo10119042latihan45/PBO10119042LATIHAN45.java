/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan45;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi: Program ini berisi program untuk menampilkan nama yang dibuat user
 */
public class PBO10119042LATIHAN45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Cetak cetakNama = new Cetak();
        
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukan Nama Anda: ");
        String inputNama = "";
        inputNama+=scanner.nextLine();
        cetakNama.setNama(inputNama);
        String nama = cetakNama.getNama();
        
        System.out.print("Mau cetak nama berapa kali?");
        cetakNama.setJmlCetak(scanner.nextInt());
        int jmlCetak = cetakNama.getJmlcetak();
        scanner.close();
        cetakNama.cetak(nama);
        cetakNama.cetak(jmlCetak, nama);
    }
    
}
