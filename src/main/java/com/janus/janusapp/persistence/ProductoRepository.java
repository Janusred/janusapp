package com.janus.janusapp.persistence;
import com.janus.janusapp.persistence.crud.ProductoCrudRepository;
import com.janus.janusapp.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
