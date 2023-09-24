package org.example.Hibernate.dao;

import org.example.Hibernate.entity.TransaccionEntity;

/**
 *
 */
public interface TransaccionDAO {

    void registrarTransaccion(TransaccionEntity transaccion);
    TransaccionEntity modificarTransaccion(TransaccionEntity transaccion);

}
