package PacoteAluno;

import PacoteAluno.CalculadoraDeNotaFinalIF;

import  java.util.List;
public class UltimaNota implements CalculadoraDeNotaFinalIF {
    public double calcularNotaFinal(List<Double> notas) {
        int ultimaNota  = notas.size();
        return notas.get(ultimaNota-1);
    }
}
