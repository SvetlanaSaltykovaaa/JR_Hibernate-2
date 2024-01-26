package com.sveta.dao;

import com.sveta.domain.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDAO<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Address.class);
    }
}
