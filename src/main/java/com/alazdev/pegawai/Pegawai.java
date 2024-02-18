/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alazdev.pegawai;

/**
 *
 * @author alazi
 */
public abstract class Pegawai implements GajiPegawai {
    // Deklarasi variable
    protected int jumlahAnak;
    protected int jamMasuk;
    protected int jamKeluar;
    protected String kodeJabatan;
    protected double gajiPokok;
    protected double transport;
    protected double totalUangLembur;
    protected double tunjanganIstri;
    protected double tunjanganAnak;

    // Membuat constructor
    public Pegawai(String kodeJabatan, double gajiPokok, double transport, double totalUangLembur, double tunjanganIstri, double tunjanganAnak) {
        this.kodeJabatan = kodeJabatan;
        this.gajiPokok = gajiPokok;
        this.transport = transport;
        this.totalUangLembur = totalUangLembur;
        this.tunjanganIstri = tunjanganIstri;
        this.tunjanganAnak = tunjanganAnak;
    }

    // Implementasi method setter
    @Override
    public void setPresensi(int jamMasuk, int jamKeluar) {
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    @Override
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Implementasi method totalGajiPokok
    @Override
    public void totalGajiPokok() {
        double denda = 0;
        if(jamMasuk > 7) {
            denda = (jamMasuk - 7) * 100000;
        }
        if(jamKeluar < 16) {
            denda = (16 - jamKeluar) * 100000;
        }
        this.gajiPokok -= denda;
    }

    // Membuat method abstract tambahanLembur
    @Override
    public abstract double tambahanLembur();

    // Membuat method abstract tambahanTunjanganAnak
    @Override
    public abstract double tambahanTunjanganAnak();

    // Implementasi method infoGaji
    @Override
    public void infoGaji() {
        System.out.println("=======================================");
        System.out.println("Jabatan: " + this.kodeJabatan);
        System.out.println("Gaji pokok: " + String.format("%.0f", this.gajiPokok));
        System.out.println("Transportasi: " + String.format("%.0f", this.transport));
        System.out.println("Total uang lembur: " + String.format("%.0f", this.totalUangLembur));
        System.out.println("Tunjangan istri: " + String.format("%.0f", this.tunjanganIstri));
        System.out.println("Tunjangan anak: " + String.format("%.0f", this.tunjanganAnak));
        System.out.println("Total gaji: " + String.format("%.0f", (this.gajiPokok + this.transport + this.totalUangLembur + this.tunjanganIstri + this.tunjanganAnak)));
        System.out.println("=======================================");
    }
}
