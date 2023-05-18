package PacoteAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
    private String nome;
    public List<Double> notas = new ArrayList<Double>();
    private CalculadoraDeNotaFinalIF calculoDeNotas;

    public void setCalculoDeNotas(CalculadoraDeNotaFinalIF calculoDeNotas) {
        this.calculoDeNotas = calculoDeNotas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public Aluno(String nome, CalculadoraDeNotaFinalIF calculoDeNotas) {
        this.nome = nome;
        this.calculoDeNotas = calculoDeNotas;
    }

    public String getNome() {
        return nome;
    }
    public double calculaNota(){
        return calculoDeNotas.calcularNotaFinal(notas);
    }
    public int compareTo(Aluno outro){
        return compareTo(outro);
    }

}
