import java.util.Scanner;



public class App {
     public static void main(String[] args) {
       
     Scanner scanner = new Scanner(System.in);
     ClimaTempo ClimaTempo = new ClimaTempo();
     boolean continuar = true;

       System.out.print("=== Sistema de comsultar o Clima ====");
      
     while (continuar) {
        System.out.println("== Escolha uma opção");
        System.out.println("[1] - Consultar previsao do tempo");
        System.out.println("[2] - sair");
        System.out.println("Digite sua opção");
        String opcao = scanner.nextLine(); //limpar o buffer

        switch (opcao) {
            case "1":
                System.out.println("Informe o nome da cidade ");
                String cidade = scanner.nextLine();
                ClimaTempo.obterClima(cidade);

                break;

            case "2":
              System.out.println("Sistema enserado");
              continuar = false;
            
                break;
             
                default:
                System.out.println("Opção invalida tente novamente ");
        }
       

     }
     
scanner.close();

     }
    }