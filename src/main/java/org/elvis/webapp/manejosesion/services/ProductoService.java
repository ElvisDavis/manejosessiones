package org.elvis.webapp.manejosesion.services;

import org.elvis.webapp.manejosesion.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> porId(Long id);
}
