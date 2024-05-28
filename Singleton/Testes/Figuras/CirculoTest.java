package Figuras;

import Fabrica.FabricaDeFiguras;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {
    Circulo circulo;
    @Before
    public void setUp() throws ValorMenorOuIgualAZeroException {
        circulo = FabricaDeFiguras.getCirculo(4);

    }

    @Test
    public void areaCirculoTest(){
        assertEquals(50.24, circulo.calcularArea(), 0);
    }


    @Test
    public void perimetroCirculoTest(){
        assertEquals(25.12, circulo.calcularPerimetro(), 0);
    }


    @Test
    public void areaCirculoFalhaTest(){
        assertEquals(50, circulo.calcularArea(), 0);
    }

    @Test
    public void perimetroCirculoFalhaTest(){
        assertEquals(25.00, circulo.calcularPerimetro(), 0);
    }





}