package es.tubalcain.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="cliente")
    private String cliente;

    @Column(name="estado")
    private Estado estado;
    private enum Estado{
        EN_ALMACEN,EN_CAMINO, ENTREGADO, CANCELADO, OBSTRUIDO
    }

    @Column(name="total")
    private double total;

    @Column(name="productos")
    private Producto[] productos;

    public Pedido(){
        fecha = new Date(System.currentTimeMillis()); //Usa la fecha actual por defecto
        cliente = null;
        estado = Estado.EN_ALMACEN;
        total = 0;
    }

    public Pedido(Date fecha, String cliente, Estado estado, Producto[] productos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.estado = estado;
        this.productos = productos;
    }
}
