/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan45;

/**
 *
 *  @author 
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi : Program ini berisi program untuk menampilkan nama yang dibuat user
 */
public class Cetak {
    private int jmlCetak;
    private String nama;
    
    public int getJmlcetak(){
        return this.jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak");
        for (int i =1; i <= jmlCetak; i++){
            System.out.println(i + ". " + nama);
        }
    }
}
