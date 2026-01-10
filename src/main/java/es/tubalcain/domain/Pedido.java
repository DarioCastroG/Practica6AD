package es.tubalcain.domain;

import es.tubalcain.dto.PedidoDTO;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

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

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public enum Estado{
        EN_ALMACEN, EN_CAMINO, ENTREGADO, CANCELADO, OBSTRUIDO
    }

    @Column(name="total")
    private double total;

    @ManyToMany
    @JoinTable(name= "pedido_producto", joinColumns=@JoinColumn(name="pedido_id"),
            inverseJoinColumns = @JoinColumn(name="producto_id") )
    @Column(name="productos")
    private List<Producto> productos;

    public Pedido(){
        fecha = new Date(System.currentTimeMillis()); //Usa la fecha actual por defecto
        cliente = null;
        estado = Estado.EN_ALMACEN;
        total = 0;
    }

    public Pedido(Date fecha, String cliente, Estado estado, List<Producto> productos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.estado = estado;
        for(Producto p: productos){
            this.productos.add(p);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
