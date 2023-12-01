package com.labti.springHibernate.service;

import com.labti.springHibernate.dao.KaryawanDAO;
import com.labti.springHibernate.model.Karyawan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("KaryawanService")
@Transactional(readOnly = true)

public class KaryawanServiceImpl implements KaryawanService {
    @Autowired
    private KaryawanDAO karyawanDao;
    
    @Transactional
    @Override
    public void save(Karyawan karyawan){
        karyawanDao.save(karyawan);
    }
    
    @Transactional
    @Override
    public void update(Karyawan karyawan){
        karyawanDao.update(karyawan);
    }
    
    @Transactional
    @Override
    public void delete(Karyawan karyawan){
        karyawanDao.delete(karyawan);
    }
    
    @Override
    public Karyawan getKaryawan(String nik){
        return karyawanDao.getKaryawan(nik);
    }
    
    @Override
    public List<Karyawan> getKaryawans(){
        return karyawanDao.getKaryawans();
    }
}
