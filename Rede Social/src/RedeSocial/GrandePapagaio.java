package RedeSocial;

import java.util.ArrayList;
import java.util.List;

public class GrandePapagaio {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {

        usuarios.add(usuario);
    }

    public boolean verificarUsuario(String nome){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome() == nome.toUpperCase()) {
                return true;
            }
        }
        return false;
    }

    public Usuario entrarUsuario(String nome){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome() == nome.toUpperCase()) {
                Usuario user = usuarios.get(i);
                return user;
            }
        }return null;
    }

    public void postar(String nome, String mensagem) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome() == nome.toUpperCase()) {
                Usuario user = usuarios.get(i);
                Post post = new Post(nome, mensagem);
                user.adicionarPost(post.toString());
                break;
            }
        }

    }

    public void seguir(Usuario atual, String aSeguir) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome() == aSeguir.toUpperCase()) {
                atual.seguirUsuario(usuarios.get(i).getNome());
                break;
            }
        }
    }

    public void verMural(Usuario usuario) {
        int encontrado = 0;
        System.out.println("Mural de "+usuario.getNome());
        usuario.getMural();
        System.out.println(" ");
        while (usuario.getListaSeguindo().size() > encontrado) {
            int i = 0;
            if (usuarios.get(i).getNome() == usuario.getSeguidor(encontrado)){
                System.out.println("Mural de "+usuarios.get(i).getNome());
                usuarios.get(i).getMural();
                System.out.println(" ");
                encontrado++;
            }
            i++;
        }
    }
}
