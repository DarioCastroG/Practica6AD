package es.tubalcain.repository;

import es.tubalcain.domain.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface ProductoSpringRepository extends JpaRepository<Producto,Long> {
    //Buscar por id
    Optional<Producto> findbyId(Long id);
    //Buscar por nombre
    Optional<Producto> findbyNombre(String nombre);

    List<Producto> findByNombreContaining(String nombre);

    Page<Producto> findAll(Pageable pageable);
}
