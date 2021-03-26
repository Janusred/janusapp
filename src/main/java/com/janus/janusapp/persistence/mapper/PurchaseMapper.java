package com.janus.janusapp.persistence.mapper;



import com.janus.janusapp.domain.Product;
import com.janus.janusapp.domain.Purchase;
import com.janus.janusapp.persistence.entity.Compra;
import com.janus.janusapp.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "purchaseId"),
            @Mapping(source = "idCliente", target = "clienteId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "commet"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "productos", target = "items"),
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases (List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}

