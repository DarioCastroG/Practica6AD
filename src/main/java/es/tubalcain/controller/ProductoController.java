package es.tubalcain.controller;

import es.tubalcain.assembler.ProductoAssembler;
import es.tubalcain.domain.Producto;
import es.tubalcain.dto.ProductoDTO;
import es.tubalcain.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    //Listar todos los productos
    @GetMapping
    public List<ProductoDTO> findAll(){
        return productoService.findAll().stream().map(productoAssembler::toDTO).collect(Collectors.toList());
    }

    //Ver un producto por id
    @GetMapping ("/{id}")
    public ProductoDTO findById(@PathVariable Long id){
        Producto producto = productoService.findById(id);
        return productoAssembler.toDTO(producto);
    }

    //Crear un nuevo producto
    @PostMapping
    public ProductoDTO create(@RequestBody ProductoDTO productoDTO) {
        Producto producto = productoAssembler.toEntity(productoDTO);
        Producto persistedProducto = productoService.createProducto(producto);

        return productoAssembler.toDTO(persistedProducto);
    }

    //Modificar un producto existente
    @PutMapping ("/{id}")
    public ProductoDTO update(@PathVariable Long id, @RequestBody ProductoDTO productoDTO){
        Producto productoExistente = productoService.findById(id);

        Producto actualizado = productoService.updateProducto(id,productoExistente);

        return productoAssembler.toDTO(actualizado);
    }

    //Eliminar un producto
    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Long id){
        productoService.deleteProducto(id);
    }

}
