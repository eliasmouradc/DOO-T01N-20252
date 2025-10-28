import java.util.Scanner;
import java.util.zip.Deflater;
import java.net.URL;
import java.net.HttpURLConnection;


public class App {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int opcao;


     System.out.println("\n === Bem vindo a Calculadora de Dinheiro ==== \n");
    
    do {
      System.out.println("\n========= Menu de opçoes ==============\n");  
      System.out.println("\n [1] - saber o valor que esta a moeda ");
      System.out.println("\n [2] - Comversor  de moedas ");
      System.out.println("\n [3] - Sair do programa ");
      System.out.println("\n Escolha uma opção");
      opcao = sc.nextInt();


     switch (opcao) {
        case 1:
         System.out.println("\n === cotação da Moeda ====");
         System.out.println(" \n Informe a moeda de origem");
         String from = sc.next().toUpperCase();

         System.out.println("\n Digite a moeda de destino ");
         String to = sc.next().toUpperCase();

         double cotacao = BuscarCotacao.buscarCotacao(from, to);
         System.out.println("1" + from +" = " + cotacao + " " + to);

     
       break;
   
        case 2:
         System.out.println("\n === Conversor de Moedas ====");
         System.out.println(" \n Informe a moeda de origem");
         from = sc.next().toUpperCase();

         System.out.println("\n Digite a moeda de destino ");
         to = sc.next().toUpperCase(); 
       
        System.out.println("\n Informe o valor que gostaria de comverter");
        double valor = sc.nextDouble();

        cotacao = BuscarCotacao.buscarcotacao(from,to);
        double comverter = valor * cotacao;

        System.out.printlf("%.2f %s = %.2f %s%n", valor, from, comverter, to);
  
        break;
 

        case 3 :
         System.out.println("Saindo do sistema ");
         break;

         default:
         System.out.println("opição invalida ");

        } while(opcao !=3);

     }

   sc.close();


 }
}