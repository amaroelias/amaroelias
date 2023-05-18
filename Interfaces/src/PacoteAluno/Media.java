package PacoteAluno;

import PacoteAluno.CalculadoraDeNotaFinalIF;

import  java.util.List;

public class Media implements CalculadoraDeNotaFinalIF {
    public double calcularNotaFinal(List<Double> notas) {
        double media = 0;
        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }
        return media / notas.size();
    }
}
