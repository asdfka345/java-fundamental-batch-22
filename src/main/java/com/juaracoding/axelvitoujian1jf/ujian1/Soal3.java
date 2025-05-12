package com.juaracoding.axelvitoujian1jf.ujian1;

import java.util.Scanner;

// Note
// Jika pengguna membeli 6 tiket pada weekday, maka:

//Harga per tiket = 35.000

//Total tanpa diskon = 6 × 35.000 = 210.000

//Diskon 10% = 21.000

//Total setelah diskon seharusnya = 189.000, bukan 270.000

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah tiket: ");
        int jumlahTiket = input.nextInt();
        input.nextLine();

        System.out.print("Hari (weekday/weekend): ");
        String hari = input.nextLine().toLowerCase();

        int hargaPerTiket;

        if (hari.equals("weekday")) {
            hargaPerTiket = 35000;
        } else if (hari.equals("weekend")) {
            hargaPerTiket = 45000;
        } else {
            System.out.println("Hari tidak valid. Gunakan 'weekday' atau 'weekend'.");
            return;
        }

        int totalHarga = hargaPerTiket * jumlahTiket;

        // Cek dan terapkan diskon
        boolean pakaiDiskon = jumlahTiket > 5;
        if (pakaiDiskon) {
            totalHarga = totalHarga - (totalHarga * 10 / 100);
        }

        // Cetak hasil sesuai format soal
        System.out.println();
        System.out.println("Jumlah tiket: " + jumlahTiket);
        if (pakaiDiskon) {
            System.out.println("Total harga (dengan diskon): " + totalHarga);
        } else {
            System.out.println("Total harga: " + totalHarga);
        }
    }
}
