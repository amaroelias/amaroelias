package RedeSocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String mensagem;
    private String nome;
    private LocalDateTime hora;

    public Post(String nome, String mensagem) {
        this.nome = nome.toUpperCase();
        this.mensagem = mensagem;
        this.hora = LocalDateTime.now();
    }

    public String getMensagem() {

        return mensagem;
    }

    public String getNome() {

        return nome;
    }

    public String getHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHoraFormatada = hora.format(formatter);
        return dataHoraFormatada;
    }

    @Override
    public String toString() {
        return getNome() + " --> " + getMensagem() + " ( " + getHora() + " ) ";
    }
}
