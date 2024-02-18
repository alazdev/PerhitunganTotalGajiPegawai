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
public class Supervisor extends Pegawai {
    // Membuat constructor
    public Supervisor() {
        super("SPV", 10000000, 1000000, 0, 300000, 0);
        this.totalUangLembur = tambahanLembur();
        this.tunjanganAnak = tambahanTunjanganAnak();
    }

    // Implementasi tambahanLembur
    @Override
    public double tambahanLembur() {
        double total = 0;
        if(this.jamKeluar > 16) {
            total = (jamKeluar - 16) * 10000;
            return this.totalUangLembur = total;
        }
        return this.totalUangLembur = total;
    }

    // Implementasi tambahanTunjanganAnak
    @Override
    public double tambahanTunjanganAnak() {
        double total = 0;
        if(this.jumlahAnak == 1) {
            total = 100000;
        } else if(this.jumlahAnak > 1) {
            total = 200000;
        }
        return this.tunjanganAnak = total;
    }
}
