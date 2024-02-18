/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alazdev.pegawai;

/**
 *
 * @author alazi
 */
public interface GajiPegawai {
    void setPresensi(int jamMasuk, int jamKeluar);
    void setJumlahAnak(int jumlahAnak);
    void totalGajiPokok();
    double tambahanLembur();
    double tambahanTunjanganAnak();
    void infoGaji();
}
