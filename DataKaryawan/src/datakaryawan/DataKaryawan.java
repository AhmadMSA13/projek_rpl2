/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datakaryawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataKaryawan {
    public static void main(String[] args) {
        List<karyawanbaru> daftarKaryawan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("Tamabah Data Karyawan Baru (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")){
                break;
            }
                System.out.print("NIK: ");
                String nik = input.nextLine();
                
                System.out.print("Nama: ");
                String nama = input.nextLine();
                
                System.out.print("Tanggal Lahir: ");
                String tgl = input.nextLine();
                
                System.out.print("Alamat: ");
                String alamat = input.nextLine();
                
                System.out.print("Jenis Kelamin: ");
                String gender = input.nextLine();
                
                System.out.print("Nomor Telepon: ");
                String nomor = input.nextLine();
                
                System.out.print("Email : ");
                String email = input.nextLine();
                
                System.out.print("Status: ");
                String status = input.nextLine();
                
                karyawanbaru karyawan = new karyawanbaru(nik,nama,tgl,alamat,gender,nomor,email,status);
                daftarKaryawan.add(karyawan);
        }
        System.out.println("Daftar Karyawan:");
        for (karyawanbaru karyawan : daftarKaryawan){
            System.out.println(karyawan);
        }
    }
    
}
