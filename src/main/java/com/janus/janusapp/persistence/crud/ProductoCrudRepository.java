package com.janus.janusapp.persistence.crud;

import com.janus.janusapp.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    List<Producto> findByIdCategoria(int idCategoria);
    Optional<List<Producto>> findByCantidadStocklessThanAndEstado(int cantidadStock, boolean estado);
}
