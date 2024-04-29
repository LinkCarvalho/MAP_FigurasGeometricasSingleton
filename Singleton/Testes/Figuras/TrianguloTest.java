package Figuras;
import Fabrica.FabricaDeFiguras;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguloTest {

    @Test
    public void existeTeste(){
        try {
            Triangulo existe = FabricaDeFiguras.getTriangulo(1, 3, 3);
            assertTrue(Triangulo.trianguloexiste(existe.getLado1(), existe.getLado2(), existe.getLado3()));
        } catch (ValorMenorOuIgualAZeroException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void equilateroTeste(){
        try {
            Triangulo equilatero = FabricaDeFiguras.getTriangulo(8, 8, 8);
            assertTrue(Triangulo.trianguloEquilatero(equilatero.getLado1(), equilatero.getLado2(), equilatero.getLado3()));
        } catch (ValorMenorOuIgualAZeroException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isocelesTeste(){
        try{
            Triangulo isoceles = FabricaDeFiguras.getTriangulo(5,4,5);
            assertTrue(Triangulo.trianguloIsoceles(isoceles.getLado1(), isoceles.getLado2(), isoceles.getLado3()));
        }catch (ValorMenorOuIgualAZeroException e ){
            e.printStackTrace();
        }

    }

    @Test
    public void retanguloTeste(){
        try{
            Triangulo retangulo = FabricaDeFiguras.getTriangulo(3,4,5);
            assertTrue(Triangulo.trianguloRetangulo(retangulo.getLado1(), retangulo.getLado2(), retangulo.getLado3()));
        }catch (ValorMenorOuIgualAZeroException e ){
            e.printStackTrace();
        }

    }
/*
    @Test
    public void naoTrianguloTeste(){
        try {
            Triangulo t = Triangulo.getInstances(1, 3, 7);
            assertTrue(Triangulo.trianguloexiste(t.getLado1(), t.getLado2(), t.getLado3()));
        } catch (ValorMenorOuIgualAZeroException e) {
            e.printStackTrace();
        }
    }*/





}