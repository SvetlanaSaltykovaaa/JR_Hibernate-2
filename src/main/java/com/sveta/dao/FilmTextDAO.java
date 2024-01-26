package com.sveta.dao;

import com.sveta.domain.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(sessionFactory, FilmText.class);
    }
}
