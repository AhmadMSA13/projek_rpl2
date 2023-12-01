package com.labti.springHibernate.dao;

import com.labti.springHibernate.model.Karyawan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class KaryawanDAOImpl implements KaryawanDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Karyawan karyawan) {
	sessionFactory.getCurrentSession().save(karyawan);
    }
    
    @Override
    public void update(Karyawan karyawan) {
	sessionFactory.getCurrentSession().update(karyawan);
    }
    
    @Override
    public void delete(Karyawan karyawan) {
	sessionFactory.getCurrentSession().delete(karyawan);
    }
    
    @Override
    public Karyawan getKaryawan(String nik) {
	return (Karyawan) sessionFactory.getCurrentSession().get(Karyawan.class, nik);
    }
    
    @Override
    public List<Karyawan> getKaryawans() {
	return sessionFactory.getCurrentSession().createCriteria(Karyawan.class).list();
    }
}
