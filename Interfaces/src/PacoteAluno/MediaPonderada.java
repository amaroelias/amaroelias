package PacoteAluno;

import PacoteAluno.CalculadoraDeNotaFinalIF;

import  java.util.List;
public class MediaPonderada implements CalculadoraDeNotaFinalIF {
    public double calcularNotaFinal(List<Double> notas) {
        int media = 0;
        int totalPeso = 0;
        int peso = 1;
        double nota;
        for(int i = 0; i < notas.size(); i++){
            nota = notas.get(i) * peso;
            media += nota;
            totalPeso += peso;
            peso += 1;
        }
        return media / totalPeso;
    }
}
