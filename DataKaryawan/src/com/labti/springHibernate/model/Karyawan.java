package com.labti.springHibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_karyawan")

public class Karyawan {
    @Id
    @Column(name = "nik", length = 8)
    private String nik;
    
    @Column(name = "nama", length = 30)
    private String nama;
    
    @Column(name = "tgll", length = 30)
    private String tgl;
    
    @Column(name = "gender", length = 30)
    private String gender;
    
    @Column(name = "alamat", length = 35)
    private String alamat;
    
    @Column(name = "nomor", length = 12)
    private String nomor;
    
    @Column(name = "email", length = 30)
    private String email;
    
    @Column(name = "status", length = 30)
    private String status;
    
    public String getNIK(){
        return nik;
    }
    public void setNIK(String nik) {
        this.nik = nik;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String aama) {
        this.nama = nama;
    }
    public String getTanggal(){
        return tgl;
    }
    public void setTanggal(String tgl) {
        this.tgl = tgl;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    private boolean laki2;
    public boolean getLaki2() {
        return laki2;
    }
    public void setLaki2(boolean laki2) {
        this.laki2 = laki2;
    }
    private boolean perempuan;
    public boolean getPerempuan() {
        return laki2;
    }
    public void setPerempuan(boolean perempuan) {
        this.perempuan = perempuan;
    }
    public String getGender() {
        if (getLaki2()) {
            return "Laki2";
        } else{
            return "Perempuan";
        }
    }
    public void setGender(String gender) {
        if ("Laki2".equals(gender)) {
            setLaki2(true);
            setPerempuan(false);
        } else{
            setLaki2(false);
            setPerempuan(true);
        }
    }
    public String getNomor(){
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
