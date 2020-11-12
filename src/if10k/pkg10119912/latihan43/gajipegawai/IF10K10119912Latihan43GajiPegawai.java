/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-----------------------------------");
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
        
        System.out.print("Nama Karyawan : ");
        gp.setNama(scn1.next());
        System.out.print("Alamat : ");
        gp.setAlamat(scn2.next());
        System.out.println("Uang Transport : Rp ");
        gp.setUangTransport(scn3.nextInt());
        System.out.print("Uang Tunjangan : Rp ");
        gp.setUangTunjangan(scn4.nextInt());
        System.out.print("Gaji Pokok : Rp ");
        gp.setGajiPokok(scn5.nextInt());
        
        System.out.println("TOTAL GAJI : Rp " + gp.totalGaji(250000, 300000, 4500000));
    }
    
}
