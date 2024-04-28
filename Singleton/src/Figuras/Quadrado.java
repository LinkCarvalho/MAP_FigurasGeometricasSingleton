package Figuras;
import excecoes.ValorMenorOuIgualAZeroException;
public class Quadrado implements  FigurasGeometricas{
    private double lado;

    public Quadrado(double lado) throws ValorMenorOuIgualAZeroException {
        if(lado <= 0 ){
            throw new ValorMenorOuIgualAZeroException();
        }
        this.lado = lado;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public String toString() {
        return "Quadrado com lados de " + lado + "cms";
    }
}
