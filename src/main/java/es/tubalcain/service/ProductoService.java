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
    public Producto findById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Producto no encontrado"));
    }

    //Crear un nuevo producto
    @Transactional
    public Producto createProducto(Producto producto) {
        productoRepository.findbyId(producto.getId()).ifPresent(a->{
            throw new RuntimeException("Producto ya existente");
        });

        return productoRepository.save(producto);
    }
    //Modificar un producto existente
    @Transactional
    public Producto updateProducto(Long id, Producto productoActualizado) {
        Producto producto = findById(id);

        producto.setNombre(productoActualizado.getNombre());
        producto.setDescripcion(productoActualizado.getDescripcion());
        producto.setPrecio(productoActualizado.getPrecio());
        producto.setCategoria(productoActualizado.getCategoria());
        producto.setStock(productoActualizado.getStock());
        return productoRepository.save(producto);

    }

    //Eliminar un producto
    @Transactional
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    //Añadir un producto a pedido

    //Eliminar un producto de pedido
}
