package loja.tenis.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loja.tenis.models.Productos;
import loja.tenis.services.ProductosServices;

@RestController
@RequestMapping("/api/Productos")
public class ProductosControllers {
    @Autowired
    private ProductosServices productosServices;

    @GetMapping
    public List<Productos> getAllProdutos() {
        return productosServices.getAllProductos();
    }

    @GetMapping("/{id}")
    public Productos getProductosById(@PathVariable UUID id) {
        return productosServices.getProductosById(id);
    }

    @PostMapping
    public Productos createProductos(@RequestBody Productos productos) {
        return productosServices.createProductos(productos);
    }

    @PutMapping("/{id}")
    public Productos updateProductos(@PathVariable UUID id, @RequestBody Productos productos) {
        return productosServices.updateProductos(productos);
    }

    @DeleteMapping("/{id}")
    public void deleteProductos(@PathVariable UUID id) {
        productosServices.deleteProductos(id);
    }
}
