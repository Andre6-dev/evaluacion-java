package org.example.Hibernate.daoImpl;

import org.example.Hibernate.HibernateUtil;
import org.example.Hibernate.dao.TransaccionDAO;
import org.example.Hibernate.entity.TransaccionEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 */
public class TransaccionDAOImpl implements TransaccionDAO {

    @Override
    public void registrarTransaccion(TransaccionEntity transaccion) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(transaccion);

            transaction.commit();
        }
    }

    @Override
    public TransaccionEntity modificarTransaccion(TransaccionEntity transaccion) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.merge(transaccion);
            transaction.commit();
        }
        return transaccion;
    }
}
