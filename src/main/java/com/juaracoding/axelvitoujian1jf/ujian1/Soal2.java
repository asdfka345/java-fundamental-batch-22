package com.juaracoding.axelvitoujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String namaFilm = input.nextLine();

        String namaFilmBesar = namaFilm.toUpperCase();

        System.out.println("Nama film dalam huruf besar: " + namaFilmBesar);
    }
}