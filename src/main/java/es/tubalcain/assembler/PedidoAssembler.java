package es.tubalcain.assembler;

import es.tubalcain.domain.Pedido;
import es.tubalcain.dto.PedidoDTO;

public class PedidoAssembler {
    public PedidoDTO toDTO(Pedido pedido) {
        if (pedido == null) return null;

        PedidoDTO dto = new PedidoDTO();

        dto.setId(pedido.getId());
        dto.setCliente(pedido.getCliente());
        dto.setEstado(pedido.getEstado());
        dto.setFecha(pedido.getFecha());
        dto.setTotal(pedido.getTotal());
        dto.setProductos(pedido.getProductos());
        return dto;
    }

    public Pedido toEntity(PedidoDTO dto) {
        if (dto == null) return null;

        Pedido pedido = new Pedido();
        mapCommonFields(dto,pedido);

        return pedido;
    }

    public void updateEntity(PedidoDTO dto, Pedido pedido) {
        if (dto == null) return;

        mapCommonFields(dto,pedido);
    }

    public void mapCommonFields(PedidoDTO dto, Pedido pedido) {
        pedido.setId(dto.getId());

    }
}
