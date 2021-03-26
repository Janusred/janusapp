package com.janus.janusapp.persistence;


import com.janus.janusapp.domain.Purchase;
import com.janus.janusapp.domain.repository.PurchaseRepository;
import com.janus.janusapp.persistence.crud.CompraCrudRepository;
import com.janus.janusapp.persistence.entity.Compra;
import com.janus.janusapp.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository  implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
  @Autowired
    private PurchaseMapper mapper;


    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        //compra.getProductos().forEach(producto -> producto.setCompra(compra));
        // eror en el get de getProductos
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
