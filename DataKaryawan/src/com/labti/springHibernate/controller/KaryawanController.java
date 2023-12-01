package com.labti.springHibernate.controller;

import com.labti.springHibernate.app;
import com.labti.springHibernate.config.KaryawanTableModel;
import com.labti.springHibernate.model.Karyawan;
import com.labti.springHibernate.view.KaryawanView;
import java.util.List;
import javax.swing.JOptionPane;

public class KaryawanController {
    private final KaryawanView karyawanView;
    private KaryawanTableModel karyawanTableModel;
    private List<Karyawan> karyawans;
    
    public KaryawanController(KaryawanView karyawanView){
        this.karyawanView = karyawanView;
    }
    
    public void tampilData() {
        karyawans = app.getKaryawanService().getKaryawans();
        karyawanTableModel = new KaryawanTableModel(karyawans);
        this.karyawanView.getTabel().setModel(karyawanTableModel);
    }
    
    public void show(){
        int index = this.karyawanView.getTabel().getSelectedRow();
        this.karyawanView.getNIK().setText(String.valueOf(
        this.karyawanView.getTabel().getValueAt(index, 0)));
        this.karyawanView.getNama().setText(String.valueOf(
        this.karyawanView.getTabel().getValueAt(index, 1)));
        this.karyawanView.getTanggal().setText(String.valueOf(
        this.karyawanView.getTabel().getValueAt(index, 2)));
        this.karyawanView.getAlamat().setText(String.valueOf(
        this.karyawanView.getTabel().getValueAt(index, 3)));
        String genderValue = String.valueOf(this.karyawanView.getTabel().getValueAt(index, 4));

        if ("Laki2".equals(genderValue)) {
            this.karyawanView.getLaki2().setSelected(true);
            this.karyawanView.getPerempuan().setSelected(false);
        } else if ("Perempuan".equals(genderValue)) {
            this.karyawanView.getLaki2().setSelected(false);
            this.karyawanView.getPerempuan().setSelected(true);
        }
        
        this.karyawanView.getNomor().setText(String.valueOf(
        this.karyawanView.getTabel().getValueAt(index, 5)));
        this.karyawanView.getEmail().setText(String.valueOf(
        this.karyawanView.getTabel().getValueAt(index, 6)));
        String statusValue = String.valueOf(this.karyawanView.getTabel().getValueAt(index, 7));
        this.karyawanView.getStatus().setSelectedItem(statusValue);
    }
    
    public void clear(){
        this.karyawanView.getNIK().setText("");
        this.karyawanView.getNama().setText("");
        this.karyawanView.getTanggal().setText("");
        this.karyawanView.getAlamat().setText("");
        this.karyawanView.getLaki2().setSelected(false);
        this.karyawanView.getPerempuan().setSelected(false);
        this.karyawanView.getNomor().setText("");
        this.karyawanView.getEmail().setText("");
        this.karyawanView.getStatus().setSelectedItem(null);
    }
    
    public void saveKaryawan(){
        Karyawan karyawan = new Karyawan();
        karyawan.setNIK(this.karyawanView.getNIK().getText());
        karyawan.setNama(this.karyawanView.getNama().getText());
        karyawan.setTanggal(this.karyawanView.getTanggal().getText());
        karyawan.setAlamat(this.karyawanView.getAlamat().getText());
        String genderValue;
        if (this.karyawanView.getLaki2().isSelected()) {
            genderValue = "Laki2";
        } else {
            genderValue = "Perempuan";
        }
        karyawan.setGender(genderValue);
        karyawan.setNomor(this.karyawanView.getNomor().getText());
        karyawan.setEmail(this.karyawanView.getEmail().getText());
        String statusValue = String.valueOf(this.karyawanView.getStatus().getSelectedItem());
        karyawan.setStatus(statusValue);
        app.getKaryawanService().save(karyawan);
        JOptionPane.showMessageDialog(null, "Data Berhasil di simpan", "info", 
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateKaryawan(){
        Karyawan karyawan = new Karyawan();
        karyawan.setNIK(this.karyawanView.getNIK().getText());
        karyawan.setNama(this.karyawanView.getNama().getText());
        karyawan.setTanggal(this.karyawanView.getTanggal().getText());
        karyawan.setAlamat(this.karyawanView.getAlamat().getText());
        String genderValue;
        if (this.karyawanView.getLaki2().isSelected()) {
            genderValue = "Laki2";
        } else {
            genderValue = "Perempuan";
        }
        karyawan.setNomor(this.karyawanView.getNomor().getText());
        karyawan.setEmail(this.karyawanView.getEmail().getText());
        String statusValue = String.valueOf(this.karyawanView.getStatus().getSelectedItem());
        karyawan.setStatus(statusValue);
        app.getKaryawanService().update(karyawan);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Update", "info", 
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void deleteKaryawan(){
        if(this.karyawanView.getNIK().getText() == null){
            JOptionPane.showMessageDialog(null, "Karyawan belum dipilih", "error", 
                    JOptionPane.ERROR_MESSAGE);
        } else {
            Karyawan karyawan = new Karyawan();
            karyawan.setNIK(this.karyawanView.getNIK().getText());
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah data ingin dihapus?", 
                    "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (pilih == JOptionPane.YES_OPTION){
                app.getKaryawanService().delete(karyawan);
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus", "info", 
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
            }
        }
    }
}
