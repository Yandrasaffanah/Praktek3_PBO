/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anak;

import induk.Mahasiswa;
import java.util.Scanner;

public class MahasiswaApp extends Mahasiswa {
    private final Scanner input = new Scanner(System.in);
    public void jalankan(){
        System.out.println ("=== " + getNamaApp() + " ===");
        
        
        int pilihan;
        do{
            System.out.println("\nMenu");
            System.out.println("1. Tambah Data (Create)");
            System.out.println("2. Lihat Data (Read)");
            System.out.println("3. Ubah Data (Update)");
            System.out.println("4. Hapus Data (Delete)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(input.nextLine());
            
            switch(pilihan) {
                case 1 -> {
                    System.out.print(" Nama mahasiswa: ");
                    String nama = input.nextLine();
                    tambahData(nama);
                }
                
                case 2 -> {
                    tampilData();
                    System.out.println("Total data: " +daftarNama.size());
                }
                    
                case 3 -> {
                    tampilData();
                    System.out.print("Nomor yang diubah:  ");
                    int noUbah = Integer.parseInt(input.nextLine());
                    System.out.print("Nama Baru: ");
                    String namaBaru = input.nextLine();
                    if (ubahData(noUbah, namaBaru)) {
                        System.out.println("Data berhasil diubah.");
                    } else {    
                        System.out.println("Nomor tidak valid.");
                        
                    }
                }
                    
                case 4 -> {
                    tampilData();
                    System.out.print("Nomor yang dihapus:  ");
                    int noHapus = Integer.parseInt(input.nextLine());
                    if (hapusData(noHapus)) {
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Nomor yang tidak valid. ");
                    }
                }
                    
                case 0 -> System.out.println("Program selesai.");
                    
                default -> System.out.println("Pilihan tidak tersedia.");   
                }
            
        } while(pilihan !=0);
    }
    
    public static void main(String [] args) {
        MahasiswaApp app = new MahasiswaApp();
        app.jalankan();
    }
}