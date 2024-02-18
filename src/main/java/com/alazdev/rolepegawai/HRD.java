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
public class HRD extends Pegawai {
    // Membuat constructor
    public HRD() {
        super("HRD", 5000000, 750000, 0, 250000, 0);
        this.totalUangLembur = tambahanLembur();
        this.tunjanganAnak = tambahanTunjanganAnak();
    }

    // Implementasi tambahanLembur
    @Override
    public double tambahanLembur() {
        double total = 0;
        if(this.jamKeluar > 16) {
            total = (this.jamKeluar - 16) * 7500;
            return this.totalUangLembur = total;
        }
        return this.totalUangLembur = total;
    }

    // Implementasi tambahanTunjanganAnak
    @Override
    public double tambahanTunjanganAnak() {
        double total = 0;
        if(this.jumlahAnak == 1) {
            total = 90000;
        } else if(this.jumlahAnak > 1) {
            total = 190000;
        }
        return this.tunjanganAnak = total;
    }
}
