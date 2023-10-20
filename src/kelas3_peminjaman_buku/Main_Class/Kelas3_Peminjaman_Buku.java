/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelas3_peminjaman_buku.Main_Class;

import kelas3_peminjaman_buku.Master.Buku;

/**
 *
 * @author mariq
 */
public class Kelas3_Peminjaman_Buku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku1 = new Buku("Pelajaran", 2011, 1000, 7);
        Buku buku2 = new Buku("Komik", 2007, 2000, 5);
        Buku buku3 = new Buku("Majalah", 2015, 1500, 2);

        System.out.println("Buku 1:");
        buku1.tampilkanInfo();
        System.out.println();

        System.out.println("Buku 2:");
        buku2.tampilkanInfo();
        System.out.println();

        System.out.println("Buku 3:");
        buku3.tampilkanInfo();
    }
    
}
