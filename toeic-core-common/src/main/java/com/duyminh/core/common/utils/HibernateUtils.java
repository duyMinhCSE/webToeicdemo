// =============================================================================
//! Build and return Sessionfactory
//!
//! \file		Hibernateutils.java
//! \author		Duy Minh
//! \date		Aug 6 2018
//! \version	Version 1.0.0
//!
// =============================================================================
// Based on abc.xyz

package com.duyminh.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private final static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        // create SessionFactory from hibernate.cfg.xml
        try{
            return new Configuration().configure().buildSessionFactory();
        }catch(Throwable e){
            System.out.println("Initial SessionFactory Failed");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
