package com.sveta.dao;

import com.sveta.domain.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Inventory.class);
    }
}
