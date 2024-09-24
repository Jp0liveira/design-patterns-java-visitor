package main.java.visitor;

import main.java.visitor.elemento.ElementoForma;

public class Retangulo implements ElementoForma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void aceitar(VisitanteForma visitante) {
        visitante.visitar(this); // O retângulo aceita o visitante
    }
}
