import Fabrica.FabricaDeFiguras;
import Figuras.Circulo;
import Figuras.Quadrado;
import Figuras.Triangulo;
import excecoes.*;
public class Main {
    public static void main(String[] args) throws ValorMenorOuIgualAZeroException {
        Circulo circulo = FabricaDeFiguras.getCirculo(6);
        Triangulo trianguloRetangulo = FabricaDeFiguras.getTriangulo(3,4,5);
        Triangulo trianguloEquilatero = FabricaDeFiguras.getTriangulo(10,10,10);
        Triangulo trianguloIsoceles = FabricaDeFiguras.getTriangulo(5,5,7);
        Quadrado quadrado1 = FabricaDeFiguras.getQuadrado(1);
        Quadrado quadrado2 = FabricaDeFiguras.getQuadrado(2);
        Quadrado quadrado3 = FabricaDeFiguras.getQuadrado(3);
        Quadrado quadrado4 = FabricaDeFiguras.getQuadrado(4);
        Quadrado quadrado5 = FabricaDeFiguras.getQuadrado(5);

        //Imprimindo o circulo
        System.out.println("\n" + circulo);
        System.out.printf("Área: %.2f\n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", circulo.calcularPerimetro());

        //Imprimindo os triangulos
        System.out.println("\n" + trianguloRetangulo);
        System.out.printf("Área: %.2f\n", trianguloRetangulo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", trianguloRetangulo.calcularPerimetro());

        System.out.println("\n" + trianguloEquilatero);
        System.out.printf("Área: %.2f\n", trianguloEquilatero.calcularArea());
        System.out.printf("Perímetro: %.2f\n", trianguloEquilatero.calcularPerimetro());

        System.out.println("\n" + trianguloIsoceles);
        System.out.printf("Área: %.2f\n", trianguloIsoceles.calcularArea());
        System.out.printf("Perímetro: %.2f\n", trianguloIsoceles.calcularPerimetro());

        //Imprimindo Quadrados
        System.out.println("\n" + quadrado1);
        System.out.printf("Área: %.2f\n", quadrado1.calcularArea());
        System.out.printf("Perímetro: %.2f\n", quadrado1.calcularPerimetro());

        System.out.println("\n" + quadrado2);
        System.out.printf("Área: %.2f\n", quadrado2.calcularArea());
        System.out.printf("Perímetro: %.2f\n", quadrado2.calcularPerimetro());

        System.out.println("\n" + quadrado3);
        System.out.printf("Área: %.2f\n", quadrado3.calcularArea());
        System.out.printf("Perímetro: %.2f\n", quadrado3.calcularPerimetro());

        System.out.println("\n" + quadrado4);
        System.out.printf("Área: %.2f\n", quadrado4.calcularArea());
        System.out.printf("Perímetro: %.2f\n", quadrado4.calcularPerimetro());

        System.out.println("\n" + quadrado5);
        System.out.printf("Área: %.2f\n", quadrado5.calcularArea());
        System.out.printf("Perímetro: %.2f\n", quadrado5.calcularPerimetro());


        //tentando criar mais circulos e triangulos

        Circulo circulo2 = FabricaDeFiguras.getCirculo(9);//como ja existe uma instancia do circulo,
        //o que vai ser imprimido é uma copia da unica instancia
        System.out.println("\n" + circulo2);
        System.out.printf("Área: %.2f\n", circulo2.calcularArea());
        System.out.printf("Perímetro: %.2f\n", circulo2.calcularPerimetro());

        //A mesma coisa ira ocorrer com o triangulo
        Triangulo trianguloEquilatero2 = FabricaDeFiguras.getTriangulo(5,5,5);
        System.out.println("\n" + trianguloEquilatero2);
        System.out.printf("Área: %.2f\n", trianguloEquilatero2.calcularArea());
        System.out.printf("Perímetro: %.2f\n", trianguloEquilatero2.calcularPerimetro());

    }
}
