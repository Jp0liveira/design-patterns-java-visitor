import main.java.visitor.CalculadoraArea;
import main.java.visitor.CalculadoraPerimetro;
import main.java.visitor.Circulo;
import main.java.visitor.Retangulo;
import main.java.visitor.elemento.ElementoForma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ElementoForma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Retangulo(4, 6));

        // Usar o visitante CalculadoraArea para calcular a área
        CalculadoraArea calculadoraArea = new CalculadoraArea();
        for (ElementoForma forma : formas) {
            forma.aceitar(calculadoraArea);  // Cada forma aceita o visitante
        }
        System.out.println("Área total: " + calculadoraArea.getAreaTotal());

        // Usar o visitante CalculadoraPerimetro para calcular o perímetro
        CalculadoraPerimetro calculadoraPerimetro = new CalculadoraPerimetro();
        for (ElementoForma forma : formas) {
            forma.aceitar(calculadoraPerimetro);  // Cada forma aceita o visitante
        }
        System.out.println("Perímetro total: " + calculadoraPerimetro.getPerimetroTotal());
    }
}