package ar.edu.et7.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculosTest {
    Calculos calculos;
    
    @BeforeEach                                         
    void setUp() {
        calculos = new Calculos();
    }
    
    @Test
    void testDiscount() {
        float resultado = calculos.discount(100.0f, 20.0f);
        assertEquals(80.0f, resultado, 0.01f);
    }
    
    // Agregar otros tests para más métodos si es necesario
}