package com.janus.janusapp.persistence.mapper;

import com.janus.janusapp.domain.Category;
import com.janus.janusapp.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings(
            {
                    @Mapping(source = "idCategoria", target = "categoryId"),
                    @Mapping(source = "descripcion", target = "category"),
                    @Mapping(source = "estado", target = "active"),
            }
    )
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "estado", ignore = true)
    Categoria toCategoria(Category category);
}
