package RedeSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GrandePapagaio redeSocial = new GrandePapagaio();

        Usuario usuarioAtual = null;

        Scanner input = new Scanner(System.in);

        final String menuUsuario = "Bem vindo! Você está no GRANDE PAPAGAIO! " +
                "Entre na Rede Social:\n " +
                "1.Para Criar Usuario\n " +
                "2.Para Entrar em um Usuario\n " +
                "4.Para Sair";

        final String menuOpcoes = "Opções disponíveis até o momento:\n " +
                "1.Novo Post\n " +
                "2.Seguir Outro Usuario\n " +
                "3.Ver Mural\n " +
                "4.Para Sair";

        final int criarUsuario = 1, entrarUsuario = 2;
        final int novoPost = 1, seguirUsuario = 2, verMural = 3, sair = 4;
        int opcaoEscolhidaUsuario, opcaoEscolhidaMenu;

        boolean entrar = false;

        System.out.println(menuUsuario);
        opcaoEscolhidaUsuario = input.nextInt();
        input.nextLine();

        switch (opcaoEscolhidaUsuario) {
            case criarUsuario:
                System.out.println("Vamos criar seu usuario, Digite seu nome:");
                String nomeUsuario = input.next();
                while (redeSocial.verificarUsuario(nomeUsuario)) {
                    System.out.println("Nome de usuario já usado! Escolha um novo:");
                    nomeUsuario = input.next();
                }
                List<String> muralPosts = new ArrayList<>();
                List<String> listSeguindo = new ArrayList<>();
                usuarioAtual = new Usuario(nomeUsuario, muralPosts, listSeguindo);
                redeSocial.adicionarUsuario(usuarioAtual);
                System.out.println("Usuario criado!");
                entrar = true;
                break;

            case entrarUsuario:
                System.out.println("Digite seu nome de usuario:");
                nomeUsuario = input.next();
                usuarioAtual = redeSocial.entrarUsuario(nomeUsuario);
                while (usuarioAtual == null) {
                    System.out.println("Usuario não existe digite Novamente!");
                    nomeUsuario = input.next();
                    usuarioAtual = redeSocial.entrarUsuario(nomeUsuario);
                }
                System.out.println("Login Realizado!");
                entrar = true;
                break;
        }


        while (entrar == true) {
            System.out.println(" \n" +menuOpcoes);
            opcaoEscolhidaMenu = input.nextInt();
            input.nextLine();

            switch (opcaoEscolhidaMenu) {
                case novoPost:
                    System.out.println("Digite o que deseja publicar: ");
                    String mensagem = input.nextLine();
                    redeSocial.postar(usuarioAtual.getNome(), mensagem);
                    System.out.println("Realizado com sucesso!");
                    break;

                case seguirUsuario:
                    System.out.println("Digite o nome do usuario que deseja seguir: ");
                    String aSeguir = input.next();
                    while (redeSocial.verificarUsuario(aSeguir) == false) {
                        System.out.println("Usuario não exite! Digite novamente:");
                        aSeguir = input.next();
                    }
                    redeSocial.seguir(usuarioAtual, aSeguir);
                    System.out.println("Realizado com sucesso!");
                    break;

                case verMural:
                    redeSocial.verMural(usuarioAtual);
                    break;

                case sair:
                    System.out.println("Grande Papaguaio Encerrado!");
                    entrar = false;
                    break;

                default:
                    System.out.println("Opção escolhida inexistente! Digite novamente: ");
                    break;
            }
        }
    }
}
