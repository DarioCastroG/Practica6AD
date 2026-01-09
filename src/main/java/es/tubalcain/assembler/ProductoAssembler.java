package es.tubalcain.assembler;

import es.tubalcain.domain.Producto;
import es.tubalcain.dto.ProductoDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductoAssembler {

    public ProductoDTO toDTO(Producto producto) {
        if (producto == null) return null;

        ProductoDTO dto = new ProductoDTO();

        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setDescripcion(producto.getDescripcion());
        dto.setPrecio(producto.getPrecio());
        dto.setCategoria(producto.getCategoria());
        dto.setStock(producto.getStock());

        return dto;
    }

    public Producto toEntity(ProductoDTO dto) {
        if (dto == null) return null;

        Producto producto = new Producto();
        mapCommonFields(dto,producto);

        return producto;
    }

    public void updateEntity(ProductoDTO dto, Producto producto) {
        if (dto == null) return;

        mapCommonFields(dto,producto);
    }

    public void mapCommonFields(ProductoDTO dto, Producto producto) {
        producto.setId(dto.getId());
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setCategoria(dto.getCategoria());
        producto.setStock(dto.getStock());
    }
}
