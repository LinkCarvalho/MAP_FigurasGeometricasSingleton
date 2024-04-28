package Fabrica;
import excecoes.ValorMenorOuIgualAZeroException;
import Figuras.*;
public class FabricaDeFiguras {
    public static Circulo getCirculo(double raio) throws ValorMenorOuIgualAZeroException{
        return Circulo.getInstance(raio);
    }

    public static Quadrado getQuadrado(double lado)throws  ValorMenorOuIgualAZeroException{
        return new Quadrado(lado);
    }

    public static Triangulo getTriangulo(double lado1, double lado2, double lado3) throws ValorMenorOuIgualAZeroException {
        return Triangulo.getInstances(lado1, lado2, lado3);
    }


}
