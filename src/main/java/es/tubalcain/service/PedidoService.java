package es.tubalcain.service;

import es.tubalcain.repository.PedidoSpringRepository;

public class PedidoService {
    private final PedidoSpringRepository pedidoRepository;

    public PedidoService(PedidoSpringRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }
}
