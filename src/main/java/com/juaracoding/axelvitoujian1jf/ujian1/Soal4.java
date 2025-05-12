package com.juaracoding.axelvitoujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] film = new String[5];

        System.out.println("Daftar film bioskop");

        // Input nama film
        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            film[i] = input.nextLine();
        }

        // Output daftar film
        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i]);
        }
    }
}