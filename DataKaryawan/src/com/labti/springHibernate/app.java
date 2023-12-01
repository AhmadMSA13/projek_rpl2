package com.labti.springHibernate;

import com.labti.springHibernate.service.KaryawanService;
import com.labti.springHibernate.view.KaryawanView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new KaryawanView().setVisible(true);
    }
    
    public static KaryawanService getKaryawanService(){
        return(KaryawanService)applicationContext.getBean("KaryawanService");
    }
}
