package com.sveta.dao;

import com.sveta.domain.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(sessionFactory, Payment.class);
    }
}
