package es.tubalcain.dto;

import es.tubalcain.domain.Pedido;
import es.tubalcain.domain.Producto;

import java.sql.Date;
import java.util.List;

public class PedidoDTO {
    private Long id;
    private Date fecha;
    private String cliente;
    private Estado pedido;
    private double total;
    private List<Producto> productos;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Estado getPedido() {
        return pedido;
    }

    public void setPedido(Estado pedido) {
        this.pedido = pedido;
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
