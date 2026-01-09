package es.tubalcain.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="precio")
    private double precio;

    @Column(name="stock")
    private int stock;

    @Column(name="categoria")
    private String categoria;

    public Producto() {
        this.nombre = null;
        this.descripcion = null;
        this.precio = 0;
        this.stock = 0;
        this.categoria = null;
    }

    public Producto(String nombre, String descripcion, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }


}