package com.sveta.dao;

import com.sveta.domain.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(SessionFactory sessionFactory) {
        super(sessionFactory, City.class);
    }

    public City getByName(String name) {
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.city= :Name", City.class);
        query.setParameter("Name", name);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
