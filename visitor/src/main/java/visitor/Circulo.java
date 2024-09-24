package main.java.visitor;

import main.java.visitor.elemento.ElementoForma;

public class Circulo implements ElementoForma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void aceitar(VisitanteForma visitante) {
        visitante.visitar(this); // O círculo aceita o visitante
    }
}
