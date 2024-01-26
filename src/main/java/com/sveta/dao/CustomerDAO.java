package com.sveta.dao;

import com.sveta.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Customer.class);
    }
}
