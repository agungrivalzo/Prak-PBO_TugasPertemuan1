/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama, nim;
        int usia, uts, uas, pilih;
        
        System.out.println("----- Input Data ----");
        System.out.print("Nama\t: "); nama  = input.nextLine();
        System.out.print("NIM\t: "); nim  = input.nextLine();
        System.out.print("Usia\t: "); usia  = input.nextInt();
        System.out.print("UTS\t: "); uts  = input.nextInt();
        System.out.print("UAS\t: "); uas  = input.nextInt();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
        
        do {
            
            System.out.println("\n\n----- MENU -----");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); pilih = input.nextInt();
            
            if (pilih==1) {
                
                System.out.println("\n\nPerkenalkan nama saya " + mahasiswa.nama + " NIM " + mahasiswa.nim);
                System.out.println("Usia\t\t: " + mahasiswa.usia);
                System.out.println("Nilai Akhir\t: " + mahasiswa.Nilaiakhir());
                
            }
            
            else if (pilih==2) {
                input = new Scanner(System.in);
                System.out.println("\n\n----- Input Data -----");
                System.out.print("Nama\t: "); mahasiswa.nama = input.nextLine();
                System.out.print("NIM\t: "); mahasiswa.nim = input.nextLine();
                System.out.print("Usia\t: "); mahasiswa.usia = input.nextInt();
                System.out.print("UTS\t: "); mahasiswa.uts = input.nextInt();
                System.out.print("UAS\t: "); mahasiswa.uas = input.nextInt();
            }
            
        } while (pilih!=3);
        
    }
    
}
