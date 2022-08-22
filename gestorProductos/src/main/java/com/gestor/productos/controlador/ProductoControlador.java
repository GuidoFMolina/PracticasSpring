package com.gestor.productos.controlador;

import com.gestor.productos.modelo.Producto;
import com.gestor.productos.servicios.ProductoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResponseExtractor;

import java.util.List;

@RestController
public class ProductoControlador {

    @Autowired
    private ProductoServicios servicios ;

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return servicios.getProducts();
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long id){
        try {
             Producto producto = servicios.getProduct(id);
             return new ResponseEntity<>(producto, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/productos/")
    public void addProducto(@RequestBody Producto producto) {
            servicios.addProduct(producto);
    }
    @PutMapping("/productos/{id}")
    public ResponseEntity<?> updateProducto(@RequestBody Producto producto, @PathVariable Long id){
        try {
            Producto productoModificable = servicios.getProduct(id);
                productoModificable.setNombre(producto.getNombre());
                productoModificable.setPrecio(producto.getPrecio());
                servicios.addProduct(productoModificable);
                return new ResponseEntity<Producto>(HttpStatus.OK);


        }catch (Exception e){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }
   @DeleteMapping("/productos/{id}")
    public void deleteProducto(@PathVariable Long id) {
           servicios.deleteProduct(id);

   }

}
