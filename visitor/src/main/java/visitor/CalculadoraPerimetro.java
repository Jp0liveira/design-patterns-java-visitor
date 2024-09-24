package main.java.visitor;

public class CalculadoraPerimetro implements VisitanteForma{
    private double perimetroTotal = 0;

    @Override
    public void visitar(Circulo circulo) {
        double perimetro = 2 * Math.PI * circulo.getRaio();
        System.out.println("Perímetro do Círculo: " + perimetro);
        perimetroTotal += perimetro;
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double perimetro = 2 * (retangulo.getLargura() + retangulo.getAltura());
        System.out.println("Perímetro do Retângulo: " + perimetro);
        perimetroTotal += perimetro;
    }

    public double getPerimetroTotal() {
        return perimetroTotal;
    }
}
