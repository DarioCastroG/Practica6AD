package es.tubalcain.controller;

import es.tubalcain.assembler.PedidoAssembler;
import es.tubalcain.assembler.ProductoAssembler;
import es.tubalcain.dto.PedidoDTO;
import es.tubalcain.dto.ProductoDTO;
import es.tubalcain.service.PedidoService;
import es.tubalcain.service.ProductoService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoService pedidoService;
    private final PedidoAssembler pedidoAssembler;

    public PedidoController(PedidoService pedidoService, PedidoAssembler pedidoAssembler){
        this.pedidoService = pedidoService;
        this.pedidoAssembler = pedidoAssembler;
    }

    //Añadir un producto a un pedido
    @PostMapping("/{id}/producto/{idProducto}")
    public PedidoDTO addProducto(@PathVariable Long id, @PathVariable Long idProducto){

    }

    //Eliminar un producto de un pedido
    @DeleteMapping("/{id}/producto/{idProducto}")
    public void deleteProductoFromPedido(@PathVariable Long id, @PathVariable Long idProducto){

    }
}
