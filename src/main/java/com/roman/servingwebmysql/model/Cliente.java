package com.roman.servingwebmysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {

    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="codigo", unique=true, length =10)
    private String codigo;
    @Column(name="nombrecliente", length = 80)
    private String nombrecliente;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Column (name="direccion", length = 80)

    private String direccion;
    @Column (name = "telefono", columnDefinition = "char(20)")
    private String telefono;
}
