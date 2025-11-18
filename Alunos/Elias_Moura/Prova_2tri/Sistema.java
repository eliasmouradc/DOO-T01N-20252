package com.exemplo;
import java.util.*;


public class Sistema {

    private Usuario usuarioAtual;
    private Favoritos favoritos = new Favoritos();
    private List<Serie>assistidas = new ArrayList<>();
    private List<Serie>desejo = new ArrayList<>();


public void inicializar(){
    System.out.println("Sistema iniciado");
}

public void CadastrarUsuario(Scanner sc){
    System.out.println("nome");
    String nome = sc.nextLine();
    System.out.println(("emai"));
    String email = sc.nextLine();
    System.out.println("senha");
    String senha = sc.nextLine();


    usuarioAtual = new Usuario(nome, email, senha);
    System.out.println("Usuario cadastrado com susesso");
}

public void login(Scanner sc){
    if(usuarioAtual == null){
        System.out.println("nenhum usuario cadastrado ainda");
        return;
    }
    System.out.println("Digite o email");
    String email = sc.nextLine();

    System.out.println("Digite a senha");
    String senha = sc.nextLine();

    if (usuarioAtual.getEmail().equals(email) && usuarioAtual.getSenha().equals(senha)) {
        System.out.println("Login realizado com sucesso! Bem-vindo, " + usuarioAtual.getNome()); 
    }else{
        System.out.println("email ou senha incoreto");
    }
}

public void buscarSerie(Scanner sc) {
        System.out.print("Digite o nome da série: ");
        String nome = sc.nextLine();

        List<Serie> resultados = Tv.buscarSeriePorNome(nome);
        if (resultados.isEmpty()) {
            System.out.println("Nenhuma série encontrada!");
            return;
        }

        for (int i = 0; i < resultados.size(); i++) {
            System.out.println("[" + i + "] " + resultados.get(i).getNome());
        }

        System.out.print("Escolha uma para adicionar (ou -1 para sair): ");
        int escolha = sc.nextInt(); sc.nextLine();
        if (escolha >= 0 && escolha < resultados.size()) {
            Serie s = resultados.get(escolha);
            System.out.println("Adicionar a:");
            System.out.println("[1] Favoritos");
            System.out.println("[2] Já assistidas");
            System.out.println("[3] Desejo assistir");
            int tipo = sc.nextInt(); sc.nextLine();

            switch (tipo) {
                case 1 -> favoritos.adicionadaFavoritos(s);
                case 2 -> assistidas.add(s);
                case 3 -> desejo.add(s);
            }
            System.out.println("Série adicionada!");
        }
    }

    public void listarFavoritos() {
        System.out.println("\n=== Favoritos ===");
        if (favoritos.getFavoritos().isEmpty()) {
            System.out.println("Nenhuma serie favorita ainda");
        
        }else{
        favoritos.listarFavoritos();
        }
    }

    public void listarAssistidas() {
        System.out.println("\n=== Já assistidas ===");
        if (assistidas.isEmpty()) {
            System.out.println("Nenhuma série assistida ainda ");

        }else{
            for(Serie s:assistidas){
                System.out.println(s);
            }

        }
    }

    public void listarDesejo() {
        System.out.println("\n=== Desejo assistir ===");
        if (desejo.isEmpty()) {
            System.out.println("nenhuma serie adicionada ao desejos ainda");

        }else{
            desejo.forEach(System.out::println);
        }
    }

    public void salvarDados() {
       // Persistencia.salvar(this);
    }



}
