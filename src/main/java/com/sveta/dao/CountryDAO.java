package com.sveta.dao;

import com.sveta.domain.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Country.class);
    }
}
