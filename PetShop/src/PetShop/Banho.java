package PetShop;

import java.time.LocalDateTime;

public class Banho extends Inventario {
    private final int codigo = 1;
    private LocalDateTime data;
    private String tamanhoAnimal;
    private String tamanhoPelo;
    private float preco;

    public Banho(String tamanhoAnimal, String tamanhoPelo) {
        this.data = LocalDateTime.now();
        this.tamanhoAnimal = tamanhoAnimal.toUpperCase();
        this.tamanhoPelo = tamanhoPelo.toUpperCase();
        this.preco = calculaPreco();
    }

    public int getCodigo() {

        return codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getTamanhoAnimal() {
        return tamanhoAnimal;
    }

    public String getTamanhoPelo() {
        return tamanhoPelo;
    }

    public float getPreco() {
        return preco;
    }

    public float calculaPreco(){

        switch (tamanhoAnimal){
            case "P":
                switch (tamanhoPelo){
                    case "longo":
                       this.preco = 40;
                       break;
                    case "medio":
                        this.preco =  30;
                        break;
                    case "curto":
                        this.preco =  20;
                        break;
                }
                break;
            case "M":
                switch (tamanhoPelo){
                    case "longo":
                        this.preco =  50;
                        break;
                    case "medio":
                        this.preco =  40;
                        break;
                    case "curto":
                        this.preco =  30;
                        break;
                }
                break;
            case "G":
                switch (tamanhoPelo){
                    case "longo":
                        this.preco = 60;
                        break;
                    case "medio":
                        this.preco =  50;
                        break;
                    case "curto":
                        this.preco =  40;
                        break;
                }
                break;
        }
        return preco;
    }
}
