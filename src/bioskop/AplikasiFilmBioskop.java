package bioskop;

import java.util.Scanner;

//  Gunakan array untuk menyimpan daftar film.

//  Gunakan method untuk modularisasi, seperti:
//  login()
//  tampilkanMenu()
//  inputFilm()
//  tampilkanFilm()
//  cariFilm()

//  Gunakan struktur switch-case dalam menu utama.

//  Gunakan looping agar menu tampil terus sampai memilih keluar.

public class AplikasiFilmBioskop {
    static Scanner input = new Scanner(System.in);
    static String[] daftarFilm = new String[10];
    static int jumlahFilm = 5;

    public static void main(String[] args) {
        inisialisasiFilm();
        login();
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tampilkanFilm();
                case 2 -> inputFilm();
                case 3 -> cariFilm();
                case 4 -> System.out.println("\nKeluar dari aplikasi.\n");
                default -> System.out.println("\nPilihan tidak valid.\n");
            }
        } while (pilihan != 4);
    }

    static void inisialisasiFilm() {
        daftarFilm[0] = "Avengers: Infinity War";
        daftarFilm[1] = "Avengers: Endgame";
        daftarFilm[2] = "Avengers: Age of Ultron";
        daftarFilm[3] = "The Avengers";
        daftarFilm[4] = "Avengers: Secret Wars";
    }

    static void login() { // Login Sistem
        while (true) {
            System.out.print("Username: ");
            String user = input.nextLine();
            System.out.print("Password: ");
            String pass = input.nextLine();

            if (user.equals("admin") && pass.equals("12345")) {
                System.out.println("\nLogin berhasil!\n");
                break;
            } else {
                System.out.println("\nUsername atau password salah.\n");
            }
        }
    }

    static void tampilkanMenu() { //    Menu Utama
        System.out.println("=== Menu Utama ===");
        System.out.println("1. Tampilkan Daftar Film");
        System.out.println("2. Input Data Film");
        System.out.println("3. Cari Film");
        System.out.println("4. Keluar");
        System.out.print("Pilih: ");
    }

    static void tampilkanFilm() { // Tampilkan Daftar Film
        System.out.println("\n--- Daftar Film ---");
        if (jumlahFilm == 0) {
            System.out.println("Belum ada film.\n");
        } else {
            for (int i = 0; i < jumlahFilm; i++) {
                System.out.println((i + 1) + ". " + daftarFilm[i]);
            }
            System.out.println();
        }
    }

    static void inputFilm() { // Input Data Film
        if (jumlahFilm >= daftarFilm.length) {
            System.out.println("\nKapasitas film penuh.\n");
            return;
        }

        System.out.print("\nMasukkan jumlah film yang ingin ditambahkan: ");
        int n = input.nextInt();
        input.nextLine(); // Penting agar input judul tidak tertabrak newline

        for (int i = 0; i < n && jumlahFilm < daftarFilm.length; i++) {
            System.out.print("Judul film ke-" + (jumlahFilm + 1) + ": ");
            String judul = input.nextLine(); // Bisa baca simbol seperti @?!'\" dll
            if (!judul.isBlank()) {
                daftarFilm[jumlahFilm++] = judul;
            } else {
                System.out.println("Judul tidak boleh kosong. Ulangi.\n");
                i--;
            }
        }
        System.out.println();
    }

    static void cariFilm() { // Cari Film
        System.out.print("\nMasukkan kata kunci film: ");
        String keyword = input.nextLine().toLowerCase();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahFilm; i++) {
            if (daftarFilm[i].toLowerCase().contains(keyword)) {
                System.out.println("Film ditemukan: " + daftarFilm[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Film tidak ditemukan.");
        }
        System.out.println();
    }
}
