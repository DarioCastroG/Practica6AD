package es.tubalcain.repository;

import es.tubalcain.domain.Pedido;
import es.tubalcain.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoSpringRepository extends JpaRepository<Pedido,Long> {
    void deleteProductoByID(Long id, Long idProducto);
}
