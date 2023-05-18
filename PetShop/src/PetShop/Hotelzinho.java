package PetShop;

import java.time.LocalDateTime;

public class Hotelzinho extends Inventario {
    private final int codigo = 2;
    private LocalDateTime hora;
    private String tamanho;
    private int horasNoHotel;
    private float preco;

    public Hotelzinho(String tamanho, int horasNoHotel) {
        this.hora = LocalDateTime.now();
        this.tamanho = tamanho.toLowerCase();
        this.horasNoHotel = horasNoHotel;
        this.preco = calculaPreco();
    }

    public float calculaPreco() {
        switch (tamanho) {
            case "P":
                this.preco = horasNoHotel * 12;
                break;
            case "M":
                this.preco = horasNoHotel * 18;
                break;
            case "G":
                this.preco = horasNoHotel * 25;
                break;
        }
        return preco;
    }
}