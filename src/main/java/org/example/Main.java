package org.example;

import org.example.Hibernate.dao.TransaccionDAO;
import org.example.Hibernate.daoImpl.TransaccionDAOImpl;
import org.example.Hibernate.entity.TransaccionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        TransaccionDAO transaccionDAO = new TransaccionDAOImpl();

        // Creación de la transacción
        TransaccionEntity transaccion = new TransaccionEntity();
        transaccion.setIdTransaccion(101);
        transaccion.setNombreDocumento("Factura");
        transaccion.setFechaRegistro(new Date());
        transaccion.setEstado("Creada");

        // Registro de la transacción
        transaccionDAO.registrarTransaccion(transaccion);

        // Modificación de la transacción
        transaccion.setEstado("Pagada");
        transaccion = transaccionDAO.modificarTransaccion(transaccion);

        // Impresión de la transacción
        System.out.println(transaccion);

    }
}