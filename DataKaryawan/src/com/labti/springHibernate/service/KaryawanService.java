package com.labti.springHibernate.service;

import com.labti.springHibernate.model.Karyawan;
import java.util.List;

public interface KaryawanService {
    public void save(Karyawan karyawan);
    public void update(Karyawan karyawan);
    public void delete(Karyawan karyawan);
    public Karyawan getKaryawan(String nik);
    public List<Karyawan> getKaryawans();
}
