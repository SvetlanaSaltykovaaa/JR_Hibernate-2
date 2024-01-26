package com.sveta.dao;

import com.sveta.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Actor.class);
    }
}
