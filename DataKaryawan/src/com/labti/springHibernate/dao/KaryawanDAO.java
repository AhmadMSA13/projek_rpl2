package com.labti.springHibernate.dao;

import com.labti.springHibernate.model.Karyawan;
import java.util.List;

public interface KaryawanDAO {
    public void save(Karyawan karyawan);
    public void update(Karyawan karyawan);
    public void delete(Karyawan karyawan);
    public Karyawan getKaryawan(String nik);
    public List<Karyawan> getKaryawans();
}
