package loja.tenis.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import loja.tenis.models.Productos;
import loja.tenis.repositories.ProductosRepository;

@Service
public class ProductosServices {
     @Autowired
    private ProductosRepository productosRepository;

    public List<Productos> getAllProductos() {
        return productosRepository.findAll();
    }

    public Productos getProductosById(UUID id) {
        return productosRepository.findById(id).orElseThrow();
    }

    public Productos createProductos(Productos productos) {
        return productosRepository.save(productos);
    }

    public Productos updateProductos(Productos productos) {
        return productosRepository.save(productos);
    }

    public void deleteProductos(UUID id) {
        productosRepository.deleteById(id);
    }
}
