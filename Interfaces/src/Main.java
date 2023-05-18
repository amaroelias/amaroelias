import java.util.ArrayList;
import java.util.Scanner;

import PacoteAluno.*;


public class Main {

    public static void main(String[] args) {
        final String menu = "Escolha o tipo de média para calcular suas notas: \n 1. Media Aritimética \n 2. Media Ponderada \n 3. Ultima Nota \n";
        final int mediaAritimetica = 1, mediaPonderada = 2, ultimaNota = 3;
        Scanner sc = new Scanner(System.in);
        int opcaoEscolhida, quantidadeNotas;
        double nota;

        System.out.println(menu);
        opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        System.out.println("Deseja fazer a média de quantas notas: ");
        quantidadeNotas = sc.nextInt();
        sc.nextLine();
        ArrayList<Double> notas = new ArrayList<Double>();

        switch (opcaoEscolhida) {
            case mediaAritimetica:
                for (int i = 0; i < quantidadeNotas; i++) {
                    System.out.println("Digite uma nota:");
                    nota = sc.nextDouble();
                    notas.add(nota);
                }
                Media calculadoraDeMediaNormal = new Media();
                double mediaNormal = calculadoraDeMediaNormal.calcularNotaFinal(notas);
                System.out.println("Sua média é: "+mediaNormal);
                break;

            case mediaPonderada:
                for (int i = 0; i < quantidadeNotas; i++) {
                    System.out.println("Digite uma nota:");
                    nota = sc.nextDouble();
                    notas.add(nota);
                }
                MediaPonderada calculadoraDeMediaPonderada = new MediaPonderada();
                double mediaPondera = calculadoraDeMediaPonderada.calcularNotaFinal(notas);
                System.out.println("Sua média é: "+mediaPondera);
                break;

            case ultimaNota:
                for (int i = 0; i < quantidadeNotas; i++) {
                    System.out.println("Digite uma nota:");
                    nota = sc.nextDouble();
                    notas.add(nota);
                }
                UltimaNota calculadoraDeMediaUltima = new UltimaNota();
                double mediaUltima = calculadoraDeMediaUltima.calcularNotaFinal(notas);
                System.out.println("Sua média é: "+mediaUltima);
                break;

            default:
                System.out.println("Encerrado!");
                break;
        }
    }
}