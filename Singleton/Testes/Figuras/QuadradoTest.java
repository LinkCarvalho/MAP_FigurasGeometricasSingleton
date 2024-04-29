package Figuras;
import Fabrica.FabricaDeFiguras;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadradoTest {
    Quadrado quadrado1;
    Quadrado quadrado2;
    @Before
    public void setUp() throws ValorMenorOuIgualAZeroException {
        quadrado1 = FabricaDeFiguras.getQuadrado(3);
        quadrado2 = FabricaDeFiguras.getQuadrado(4);
    }

    @Test
    public void areaQuadrado1Test(){
        assertEquals(9.00, quadrado1.calcularArea(), 0);
    }

    @Test
    public void areaQuadrado2Test(){
        assertEquals(16.00, quadrado2.calcularArea(), 0);
    }

    @Test
    public void perimetroQuadrado1Test(){
        assertEquals(12.00, quadrado1.calcularPerimetro(), 0);
    }

    @Test
    public void perimetroQuadrado2Test(){
        assertEquals(16.00, quadrado2.calcularPerimetro(), 0);
    }

   /* @Test
    public void areaQuadrado1FalhaTest(){
        assertEquals(8, quadrado1.calcularArea(), 0);
    }*/
}