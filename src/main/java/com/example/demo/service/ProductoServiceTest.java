package com.example.demo.service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ProductoServiceTest {

    @InjectMocks
    private ProductoService productoService;

    @Mock
    private ProductoRepository productoRepository;

    @Test
    public void testGetProductoById() {
        Producto producto = new Producto(1L, "Test Producto", 100.0);
        Mockito.when(productoRepository.findById(1L)).thenReturn(Optional.of(producto));
        Producto found = productoService.getProductoById(1L);
        assertEquals(producto.getNombre(), found.getNombre());
    }
}
