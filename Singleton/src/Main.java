import Fabrica.FabricaDeFiguras;
import Figuras.Circulo;
import Figuras.Quadrado;
import Figuras.Triangulo;
import excecoes.*;
public class Main {
    public static void main(String[] args) throws ValorMenorOuIgualAZeroException {
        Circulo circulo = FabricaDeFiguras.getCirculo(6);;
        Triangulo trianguloRetangulo;
        Triangulo trianguloEquilatero;
        Triangulo trianguloEscaleno;
        Quadrado quadrado1;
        Quadrado quadrado2;
        Quadrado quadrado3;
        Quadrado quadrado4;
        Quadrado quadrado5;

        Circulo circulo2;

        circulo2 = FabricaDeFiguras.getCirculo(9);

        System.out.println("\n" + circulo);
        System.out.printf("Área: %.2f\n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", circulo.calcularPerimetro());

        System.out.println("\n" + circulo2);
        System.out.printf("Área: %.2f\n", circulo2.calcularArea());
        System.out.printf("Perímetro: %.2f\n", circulo2.calcularPerimetro());

    }
}
