package es.tubalcain.service;

import es.tubalcain.domain.Pedido;
import es.tubalcain.domain.Producto;
import es.tubalcain.repository.PedidoSpringRepository;
import es.tubalcain.repository.ProductoSpringRepository;
import jakarta.transaction.Transactional;

public class PedidoService {
    private final PedidoSpringRepository pedidoRepository;
    private final ProductoSpringRepository productoRepository;

    public PedidoService(PedidoSpringRepository pedidoRepository, ProductoSpringRepository productoRepository){
        this.pedidoRepository = pedidoRepository;
        this.productoRepository = productoRepository;
    }

    //Añade un producto a un pedido
    @Transactional
    public Pedido addProducto(Long id, Long idPedido){
        Pedido pedido = pedidoRepository.findById(idPedido).get();
        Producto producto = productoRepository.findById(id).get();

        pedido.getProductos().add(producto);
        return pedidoRepository.save(pedido);
    }

    //Elimina un producto de un pedido
    @Transactional
    public void removeProducto(Long id, Long idPedido){
        Pedido pedido = pedidoRepository.findById(idPedido).get();
        Producto producto = productoRepository.findById(id).get();

    }

}
