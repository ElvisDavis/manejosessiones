package org.elvis.webapp.manejosesion.services;

import org.elvis.webapp.manejosesion.models.Producto;

import java.util.Arrays;
import java.util.List;

public class ProductoServiceImplement implements ProductoService{
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion", 175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computacion", 40000));
    }
}
