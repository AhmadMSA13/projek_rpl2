package com.labti.springHibernate.config;

import com.labti.springHibernate.model.Karyawan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KaryawanTableModel extends AbstractTableModel {
    private List<Karyawan> karyawans = new ArrayList<>();
    private final String HEADER[] = {"NIK", "Nama", "Tanggal Lahir", "Alamat", 
        "Jenis Kelamin", "Nomor Telp.", "Email", "Status"};
    
    public KaryawanTableModel(List<Karyawan> karyawans) {
	this.karyawans = karyawans;
    }
    
    @Override
    public int getRowCount() {
	return karyawans.size();
    }
    
    @Override
    public int getColumnCount() {
	return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
	return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	Karyawan karyawan = karyawans.get(rowIndex);
            switch (columnIndex) {
		case 0:
                    return karyawan.getNIK();
		case 1:
                    return karyawan.getNama();
		case 2:
                    return karyawan.getTanggal();
		case 3:
                    return karyawan.getGender();
                case 4:
                    return karyawan.getAlamat();
                case 5:
                    return karyawan.getNomor();
                case 6:
                    return karyawan.getEmail();
                case 7:
                    return karyawan.getStatus();
		default:
                    return null;
		}
    }
}
