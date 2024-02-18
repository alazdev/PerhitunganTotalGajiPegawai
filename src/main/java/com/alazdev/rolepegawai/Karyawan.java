/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alazdev.rolepegawai;
import com.alazdev.pegawai.Pegawai;

/**
 *
 * @author alazi
 */
public class Karyawan extends Pegawai {
    // Membuat constructor
    public Karyawan() {
        super("KRY", 1500000, 250000, 0, 200000, 0);
        this.totalUangLembur = tambahanLembur();
        this.tunjanganAnak = tambahanTunjanganAnak();
    }

    // Implementasi tambahanLembur
    @Override
    public double tambahanLembur() {
        double total = 0;
        if(this.jamKeluar > 16) {
            total = (this.jamKeluar - 16) * 5000;
            return this.totalUangLembur = total;
        }
        return this.totalUangLembur = total;
    }

    // Implementasi tambahanTunjanganAnak
    @Override
    public double tambahanTunjanganAnak() {
        double total = 0;
        if(this.jumlahAnak == 1) {
            total = 60000;
        } else if(this.jumlahAnak > 1) {
            total = 130000;
        }
        return this.tunjanganAnak = total;
    }
}
