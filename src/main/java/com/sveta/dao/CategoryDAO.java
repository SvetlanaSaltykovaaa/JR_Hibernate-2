package com.sveta.dao;

import com.sveta.domain.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Category.class);
    }
}
