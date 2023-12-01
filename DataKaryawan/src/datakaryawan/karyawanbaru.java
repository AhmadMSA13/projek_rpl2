/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datakaryawan;

/**
 *
 * @author user
 */
public class karyawanbaru {
    private final String nik;
    private final String nama;
    private final String tgl;
    private final String alamat;
    private final String gender;
    private final String nomor;
    private final String email;
    private final String status;
    
    public karyawanbaru(String nik, String nama, String tgl, String alamat, String gender, String nomor, 
            String email, String status){
                this.nik = nik;
                this.nama = nama;
                this.tgl = tgl;
                this.alamat = alamat;
                this.gender = gender;
                this.nomor = nomor;
                this.email = email;
                this.status = status;
    }
    
    public String getNIK(){
        return nik;
}
    public String getNama(){
        return nama;
}
    public String getTanggal(){
        return tgl;
}
    public String getAlamat(){
        return alamat;
}
    public String getGender(){
        return gender;
}
    public String getNomor(){
        return nomor;
}
    public String getEmail(){
        return email;
}

    public String getStatus(){
        return status;
}
    public String toString(){
        return "NIK: "+nik+", Nama: "+nama+", Tanggal Lahir: "+tgl+", Alamat: "+alamat+",Jenis Kelamin: "+gender+
                ", Nomor Telepon: "+nomor+", Email: "+email+", Status: "+status;
    }
}
