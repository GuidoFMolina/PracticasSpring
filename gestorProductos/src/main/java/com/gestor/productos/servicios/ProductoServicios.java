package com.gestor.productos.servicios;

import com.gestor.productos.modelo.Producto;
import com.gestor.productos.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicios {

    @Autowired
    private ProductoRepositorio repositorio;

    public List<Producto> getProducts() {
        return repositorio.findAll();
    }
    public Producto getProduct(Long id) {
        return repositorio.findById(id).get();
    }
    public void addProduct(Producto producto) {
        repositorio.save(producto);
    }
    public void deleteProduct(Long id) {
        repositorio.deleteById(id);
    }
}
