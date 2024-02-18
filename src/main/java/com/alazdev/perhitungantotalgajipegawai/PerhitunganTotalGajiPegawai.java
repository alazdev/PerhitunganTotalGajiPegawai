/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alazdev.perhitungantotalgajipegawai;
import java.util.Scanner;
import com.alazdev.rolepegawai.*;

/**
 *
 * @author alazi
 */
public class PerhitunganTotalGajiPegawai {

    public static void main(String[] args) {
        // Membuat input untuk kode, jumlahAnak, jamMasuk dan jamKeluar
        Scanner kode = new Scanner(System.in);
        System.out.print("Masukkan Kode >>> ");
        String kodeJabatan = kode.nextLine();

        Scanner jumlahAnak = new Scanner(System.in);
        System.out.print("Jumlah Anak? >>> ");
        int jumlah_anak = jumlahAnak.nextInt();

        Scanner jamMasuk = new Scanner(System.in);
        System.out.print("Jam presensi masuk >>> ");
        int jam_masuk = jamMasuk.nextInt();

        Scanner jamKeluar = new Scanner(System.in);
        System.out.print("Jam presensi keluar >>> ");
        int jam_keluar = jamKeluar.nextInt();

        // Menggunakan switch case pada kodeJabatan
        switch (kodeJabatan) {
            case "SPV" -> {
                Supervisor supervisor = new Supervisor();
                supervisor.setPresensi(jam_masuk, jam_keluar);
                supervisor.setJumlahAnak(jumlah_anak);
                supervisor.tambahanLembur();
                supervisor.tambahanTunjanganAnak();
                supervisor.totalGajiPokok();
                supervisor.infoGaji();
            }
            case "HRD" -> {
                HRD hrd = new HRD();
                hrd.setPresensi(jam_masuk, jam_keluar);
                hrd.setJumlahAnak(jumlah_anak);
                hrd.tambahanLembur();
                hrd.tambahanTunjanganAnak();
                hrd.totalGajiPokok();
                hrd.infoGaji();
            }
            case "TKN" -> {
                Teknisi teknisi = new Teknisi();
                teknisi.setPresensi(jam_masuk, jam_keluar);
                teknisi.setJumlahAnak(jumlah_anak);
                teknisi.tambahanLembur();
                teknisi.tambahanTunjanganAnak();
                teknisi.totalGajiPokok();
                teknisi.infoGaji();
            }
            case "KRY" -> {
                Karyawan karyawan = new Karyawan();
                karyawan.setPresensi(jam_masuk, jam_keluar);
                karyawan.setJumlahAnak(jumlah_anak);
                karyawan.tambahanLembur();
                karyawan.tambahanTunjanganAnak();
                karyawan.totalGajiPokok();
                karyawan.infoGaji();
            }
        }
    }
}