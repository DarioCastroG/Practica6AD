package es.tubalcain.dto;

import es.tubalcain.domain.Pedido;
import es.tubalcain.domain.Producto;

import java.sql.Date;
import java.util.List;

public class PedidoDTO {
    private Long id;
    private Date fecha;
    private String cliente;
    private Pedido.Estado estado;
    private double total;
    private List<Producto> productos;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Date getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Pedido.Estado getEstado() {
        return estado;
    }

    public void setEstado(Pedido.Estado estado) {
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

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    private enum Estado{
        EN_ALMACEN,EN_CAMINO, ENTREGADO, CANCELADO, OBSTRUIDO
    }




}
