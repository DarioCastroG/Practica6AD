package es.tubalcain.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(name="nombre")
    @Getter @Setter
    private String nombre;

    @Column(name="descripcion")
    @Getter @Setter
    private String descripcion;

    @Column(name="precio")
    @Getter @Setter
    private double precio;

    @Column(name="stock")
    @Getter @Setter
    private int stock;

    @Column(name="categoria")
    @Getter @Setter
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