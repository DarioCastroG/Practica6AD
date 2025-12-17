package es.tubalcain.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="cliente")
    private String cliente;

    @Column(name="estado")
    private String estado;

    @Column(name="total")
    private double total;

    @Column(name="productos")
    private Producto productos;
}
