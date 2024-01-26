package com.sveta.dao;

import com.sveta.domain.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Store.class);
    }
}
