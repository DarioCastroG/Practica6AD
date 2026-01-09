package es.tubalcain.service;

import es.tubalcain.domain.Producto;
import es.tubalcain.repository.ProductoSpringRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoSpringRepository productoRepository;

    public ProductoService(ProductoSpringRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    //Listar todos los productos
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    //Listar producto por id
    public List<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    //Crear un nuevo producto

    //Modificar un producto existente

    //Eliminar un producto

    //Añadir un producto a pedido

    //Eliminar un producto de pedido
}
