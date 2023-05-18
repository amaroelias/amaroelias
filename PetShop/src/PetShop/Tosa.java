package PetShop;

public class Tosa extends Inventario {
    private final int codigo = 3;
    private String tamanho;
    private float preco;

    public Tosa(String tamanho) {
        this.tamanho = tamanho.toUpperCase();
        this.preco = calculaPreco();
    }
    public float calculaPreco(){
        switch (tamanho) {
            case "P":
                this.preco = 22;
                break;
            case "M":
                this.preco = 30;
                break;
            case "G":
                this.preco = 40;
                break;
        }
        return preco;
    }
}
