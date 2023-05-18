package RedeSocial;

import java.util.List;


public class Usuario {
    private String nome;
    private List<String> mural;
    private List<String> listaSeguindo;

    public Usuario(String nome, List<String> mural, List<String> seguindo) {
        this.nome = nome.toUpperCase();
        this.mural = mural;
        this.listaSeguindo = seguindo;
    }

    public String getNome() {

        return nome;
    }

    public void getMural() {
        for(String s : mural){
            System.out.print(" \n"+s);
        }
    }

    public List<String> getListaSeguindo() {

        return listaSeguindo;
    }
    public String getSeguidor(int indice) {

        return listaSeguindo.get(indice);
    }

    public void adicionarPost(String post) {

        mural.add(post);
    }

    public void seguirUsuario(String usuario) {

        listaSeguindo.add(usuario);
    }

}