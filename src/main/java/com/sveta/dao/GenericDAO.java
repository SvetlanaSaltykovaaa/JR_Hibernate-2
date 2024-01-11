package com.sveta.dao;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public abstract class GenericDAO<T> {

    private final SessionFactory sessionFactory;
    private final Class<T> clazz;

    public GenericDAO(SessionFactory sessionFactory, Class<T> clazzToSet) {
        this.sessionFactory = sessionFactory;
        this.clazz = clazzToSet;
    }

    public List<T> findAll(){
        return getCurrentSession().createQuery("from "+clazz.getName(),clazz).list();
    }

    public T getByID(final int id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    public List<T> getItems(int offset, int count){
        Query query = getCurrentSession().createQuery("from "+clazz.getName(),clazz);
        query.setFirstResult(offset);
        query.setMaxResults(count);
        return  query.getResultList();
    }

    public T save(final T entity) {
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }

    public T update(final T entity) {
        return (T) getCurrentSession().merge(entity);
    }

    public void delete(final T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }
public void deleteByID(int id){
        final T entity = getByID(id);
        delete(entity);
}

protected Session getCurrentSession(){
        return  sessionFactory.getCurrentSession();
}

}
