package com.janus.janusapp.persistence.crud;

import com.janus.janusapp.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
}
