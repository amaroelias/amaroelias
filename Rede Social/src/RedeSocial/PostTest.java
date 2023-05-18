package RedeSocial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    Post postTest = new Post("pessoa","dia de sol");

    @Test
    void getMensagem() {
        assertEquals("dia de sol",postTest.getMensagem());
    }

    @Test
    void getNome() {
        assertEquals("PESSOA", postTest.getNome());
    }

}