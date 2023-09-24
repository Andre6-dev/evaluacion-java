package org.example.Hibernate.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

/**
 * 
*/
@Entity
@Table(name = "Transaccion", schema = "public", catalog = "hibernate")
public class TransaccionEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTransaccion")
    private int idTransaccion;
    @Basic
    @Column(name = "nombreDocumento")
    private String nombreDocumento;
    @Basic
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
    @Basic
    @Column(name = "estado")
    private String estado;

    public TransaccionEntity() {

    }

    public TransaccionEntity(int idTransaccion, String nombreDocumento, Date fechaRegistro, String estado) {
        this.idTransaccion = idTransaccion;
        this.nombreDocumento = nombreDocumento;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public TransaccionEntity(String factura, Date date, String creada) {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransaccionEntity that = (TransaccionEntity) o;
        return idTransaccion == that.idTransaccion && Objects.equals(nombreDocumento, that.nombreDocumento) && Objects.equals(fechaRegistro, that.fechaRegistro) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransaccion, nombreDocumento, fechaRegistro, estado);
    }
}
