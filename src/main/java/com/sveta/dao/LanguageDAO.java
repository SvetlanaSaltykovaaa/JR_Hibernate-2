package com.sveta.dao;

import com.sveta.domain.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Language.class);
    }
}
