package es.tubalcain.controller;

import es.tubalcain.assembler.PedidoAssembler;
import es.tubalcain.assembler.ProductoAssembler;
import es.tubalcain.dto.ProductoDTO;
import es.tubalcain.service.ProductoService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/pedido")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoService pedidoService;
    private final PedidoAssembler pedidoAssembler;

    //Añadir un producto a un pedido
    @PostMapping("/{id}/producto/{idProducto}")
    public PedidoDTO addProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO){

    }

    //Eliminar un producto de un pedido
    @DeleteMapping("/{id}/producto/{idProducto}")
    public void deleteProductoFromPedido(){

    }
}
