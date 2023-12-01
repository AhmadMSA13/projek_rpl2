/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datakaryawan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControlKaryawan {
    ArrayList<karyawanbaru> ArrayData;
    DefaultTableModel tablekaryawan;
    
    public ControlKaryawan(){
        ArrayData = new ArrayList<karyawanbaru>();
    }
    
    public void InsertData(String nik, String nama, String tgl, String gender, String alamat, 
            String nomor, String email, String status){
        karyawanbaru karyawan = new karyawanbaru(nik, nama, tgl, alamat,gender, nomor, email, status);
        ArrayData.add(karyawan);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = { "NIK", "Nama", "Tanggal Lahir", "Alamat", "Jenis Kelamin", "Nomor Telp.",
        "Email", "Status"};
        Object[][] objData = new Object[ArrayData.size()][8];
        int i = 0;
        
        for(karyawanbaru n : ArrayData){
            String[] arrData = {n.getNIK(), n.getNama(), n.getTanggal(), n.getGender(), 
                n.getAlamat(), n.getNomor(), n.getEmail(), n.getStatus()};
            objData[i] = arrData;
            i++;
        }
        
        tablekaryawan = new DefaultTableModel (objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
      return tablekaryawan;
    }
    
    public DefaultTableModel deleteData(){
        tablekaryawan.setRowCount(0);
        
        return tablekaryawan;
    }
    
    public DefaultTableModel updateData(String nik, String nama, String tgl, String gender, String alamat, 
            String nomor, String email, String status, int index){
        
        ArrayData.set(index, new karyawanbaru(nik, nama, tgl, alamat,gender, nomor, email, status));
        tablekaryawan.setValueAt(nik, index, 0);
        tablekaryawan.setValueAt(nama, index, 1);
        tablekaryawan.setValueAt(tgl, index, 2);
        tablekaryawan.setValueAt(alamat, index, 3);
        tablekaryawan.setValueAt(gender, index, 4);
        tablekaryawan.setValueAt(nomor, index, 5);
        tablekaryawan.setValueAt(email, index, 6);
        tablekaryawan.setValueAt(status, index, 7);

        return tablekaryawan;
    }
}
