package Figuras;
import excecoes.ValorMenorOuIgualAZeroException;

import java.util.Arrays;

public class Triangulo implements FigurasGeometricas{
    private static Triangulo retanguloInstancia = null;
    private static Triangulo iscocelesInstancia = null;
    private static Triangulo equilateroInstancia = null;

    private double lado1, lado2, lado3;

    private Triangulo(double lado1, double lado2, double lado3) throws ValorMenorOuIgualAZeroException{
        if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0){
            throw new ValorMenorOuIgualAZeroException();
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static Triangulo getInstances(double lado1,double lado2,double lado3) throws ValorMenorOuIgualAZeroException{
        if(!trianguloexiste(lado1, lado2, lado3)){
            return null;
        }

        if(trianguloRetangulo(lado1, lado2, lado3)){
            if(retanguloInstancia == null){
                retanguloInstancia = new Triangulo(lado1, lado2, lado3);
            }
            return retanguloInstancia;
        }

        if (trianguloEquilatero(lado1, lado2, lado3)){
            if (equilateroInstancia == null){
                equilateroInstancia = new Triangulo(lado1, lado2, lado3);
            }
            return equilateroInstancia;
        }

        if(trianguloIsoceles(lado1, lado2, lado3)){
            if(iscocelesInstancia == null){
                iscocelesInstancia = new Triangulo(lado1, lado2, lado3);
            }
            return iscocelesInstancia;
        }
        return null;
    }

    public static boolean trianguloexiste(double lado1, double lado2, double lado3){
        if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1){
            return true;
        }
        return false;
    }

    public static boolean trianguloRetangulo(double lado1, double lado2, double lado3){
        double[] array = {lado1, lado2, lado3};
        Arrays.sort(array);
        lado1 = array[0];
        lado2 = array[1];
        lado3 = array[2];
        return Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2);
    }

    public static boolean trianguloEquilatero(double lado1, double lado2, double lado3){
        return lado1 == lado2 && lado1 == lado3;
    }

    public static boolean trianguloIsoceles(double lado1, double lado2, double lado3){
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }


    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Os lados do triangulo sao iguais a: " + lado1 +"cm," + lado2 +"cm," + lado3 + "cm";
    }
}
