package Jobsheet2;

import java.lang.reflect.Member;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data member
        System.out.print("Masukkan ID Member   : ");
        int idMember = input.nextInt();
        input.nextLine(); // buang newline
        System.out.print("Masukkan Nama Member : ");
        String namaMember = input.nextLine();

        // Input data game
        System.out.print("Masukkan ID Game     : ");
        int idGame = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Nama Game   : ");
        String namaGame = input.nextLine();
        System.out.print("Masukkan Harga Sewa  : ");
        double hargaSewa = input.nextDouble();

        // Input lama sewa
        System.out.print("Masukkan Lama Sewa (hari): ");
        int lamaSewa = input.nextInt();

        // Membuat objek member, game, dan peminjaman
        member member = new member(idMember, namaMember);
        game game = new game(idGame, namaGame, hargaSewa);
        peminjaman peminjaman = new peminjaman(1, member, game, lamaSewa);

        // Menampilkan detail transaksi
        peminjaman.tampilkanData();

        input.close();
    }
}
