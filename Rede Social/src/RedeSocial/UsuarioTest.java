package RedeSocial;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class UsuarioTest {

    List<String> mural = new ArrayList<>();
    List<String> seguindo = new ArrayList<>();
    Usuario usuario1 = new Usuario("amaro",mural,seguindo);
    Usuario usuario2 = new Usuario("pedro",mural,seguindo);
    Usuario usuario3 = new Usuario("josé",mural,seguindo);
    Usuario usuario4 = new Usuario("bernardo",mural,seguindo);


    @Test
    void getNome() {
        assertEquals("AMARO", usuario1.getNome());
    }

    @Test
    void getListaSeguindo() {
        usuario1.seguirUsuario("pedro");
        usuario1.seguirUsuario("josé");
        usuario1.seguirUsuario("bernardo");
        assertEquals("[pedro, josé, bernardo]",usuario1.getListaSeguindo().toString());
    }

    @Test
    void getSeguidor() {
        usuario1.seguirUsuario("josé");
        assertEquals("josé",usuario1.getSeguidor(0));
    }

    String test = "jaca";

    @Test
    void adicionarPost() {
        usuario1.adicionarPost(test);
        assertEquals("jaca", mural.get(0));
    }

    @Test
    void seguirUsuario() {
        usuario1.seguirUsuario("pedro");
        assertEquals("pedro",usuario1.getSeguidor(0));
    }
}