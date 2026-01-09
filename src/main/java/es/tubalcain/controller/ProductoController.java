package es.tubalcain.controller;

import es.tubalcain.assembler.ProductoAssembler;
import es.tubalcain.domain.Producto;
import es.tubalcain.dto.ProductoDTO;
import es.tubalcain.service.ProductoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    private final ProductoService productoService;
    private final ProductoAssembler productoAssembler;

    public ProductoController(ProductoService productoService, ProductoAssembler productoAssembler) {
        this.productoService = productoService;
        this.productoAssembler = productoAssembler;
    }

    @PostMapping
    public ProductoDTO create(@RequestBody ProductoDTO productoDTO) {
        Producto producto = productoAssembler.toEntity(productoDTO);
        Producto persistedProducto = productoService.createProducto(producto);

        return productoAssembler.toDTO(persistedProducto);
    }
}
