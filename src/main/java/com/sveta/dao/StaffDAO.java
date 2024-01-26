package com.sveta.dao;

import com.sveta.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Staff.class);
    }
}
