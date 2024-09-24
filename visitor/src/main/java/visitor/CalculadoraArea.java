package main.java.visitor;

public class CalculadoraArea implements VisitanteForma {
    private double areaTotal = 0;

    @Override
    public void visitar(Circulo circulo) {
        double area = Math.PI * circulo.getRaio() * circulo.getRaio();
        System.out.println("Área do Círculo: " + area);
        areaTotal += area;
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double area = retangulo.getLargura() * retangulo.getAltura();
        System.out.println("Área do Retângulo: " + area);
        areaTotal += area;
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}
