package com.exemplo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Chave de acesso da API [yeZmg7gXze85N9wJNziq4oLhhV7HCqWi ]*/


public class App {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);  
    
      Sistema sistema = new Sistema();
      sistema.inicializar();
      int opcao = -1;

    do{

    System.out.println("\n ==== Bem vindo ao sistema de Strimer ==== \n");

    System.out.println("[1] - Cadastrar usuario \n");
    System.out.println("[2] - Entrar no login \n");
    System.out.println("[3] - ver lancamentos \n");
    System.out.println("[4] - Lista dos favoritos \n");
    System.out.println("[5] - Lista das series Favoritas \n");
    System.out.println("[6] - Séries que deseja assistir \n");
    System.out.println("[7] - sair do sistema \n");
    System.out.println("Escolha");

try{
  opcao = Integer.parseInt(sc.nextLine());
}catch(Exception e){
  opcao = -1;
}

switch(opcao){
    case 1 -> sistema.CadastrarUsuario(sc);

    case 2 -> sistema.login(sc);

    case 3 -> sistema.buscarSerie(sc);//busca serie na chave

    case 4 -> sistema.listarFavoritos();  //chamar os metodos que ainda nao listo
   
    case 5 -> sistema.listarAssistidas(); //chama os metodos
   
    case 6 -> sistema.listarDesejo();

    case 7 -> {
          System.out.println("Saindo...!");
          sistema.salvarDados();
        }
  default ->
      System.out.println("Opição invalida retorne novamente ");  
}
    

    }while(opcao != 7);
      sc.close();

  }

}






    

    