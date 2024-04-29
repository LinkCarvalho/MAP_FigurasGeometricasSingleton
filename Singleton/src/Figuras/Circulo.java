package Figuras;
import excecoes.ValorMenorOuIgualAZeroException;
public class Circulo implements FigurasGeometricas {

    private static Circulo instancia = null;
    private double raio;
    public final double PI = 3.14;

    private Circulo(double raio) throws ValorMenorOuIgualAZeroException{
        if(raio<=0){
            throw new ValorMenorOuIgualAZeroException();
        }
        this.raio = raio;
    }

    public static Circulo getInstance(double raio)throws ValorMenorOuIgualAZeroException{
        if(instancia == null){
            instancia = new Circulo(raio);
        }
        return instancia;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo com raio = " + raio;
    }

}
