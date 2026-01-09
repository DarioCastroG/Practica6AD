package es.tubalcain.assembler;

import es.tubalcain.domain.Pedido;
import es.tubalcain.domain.Producto;
import es.tubalcain.dto.PedidoDTO;
import es.tubalcain.dto.ProductoDTO;

public class PedidoAssembler {
    public PedidoDTO toDTO(Pedido pedido) {
        if (pedido == null) return null;

        ProductoDTO dto = new ProductoDTO();

        dto.setId(pedido.getId());
        dto.setNombre(pedido.getNombre());
        dto.setDescripcion(pedido.getDescripcion());
        dto.setPrecio(pedido.getPrecio());
        dto.setCategoria(pedido.getCategoria());
        dto.setStock(pedido.getStock());

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
