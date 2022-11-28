package br.com.VitorOzorio.teste;
import java.util.Scanner;

public class FuelPump {

    public static void main(String[] args) {

     int opcao,opcao1;
     boolean verificadora = true;
     Scanner Teclado = new Scanner(System.in);

     Combustivel Gasolina = new Combustivel();
     Combustivel Disel = new Combustivel();
     Combustivel Etanol = new Combustivel();

     Gasolina.tipoCombustivel = "Gasolina";
     Disel.tipoCombustivel = "Disel";
     Etanol.tipoCombustivel = "Etanol";



       do {

           System.out.println("escolha uma opção \n1 para gasolina \n2 para disel \n3 para etanol ");
           opcao = Teclado.nextInt();

           if (opcao == 1) {

               System.out.println("o quanto voce deseja de " + Gasolina.tipoCombustivel + " ?");
               Gasolina.valorPedido = Teclado.nextDouble();

               System.out.println("Qual o valor da " + Gasolina.tipoCombustivel + " em sua cidade ?");
               Gasolina.valorCombustivel = Teclado.nextDouble();

               Gasolina.mostrardados();

           }

           if (opcao == 2) {

               System.out.println("o quanto voce deseja de " + Disel.tipoCombustivel + " ?");
               Disel.valorPedido = Teclado.nextDouble();

               System.out.println("Qual o valor do " + Disel.tipoCombustivel + " em sua cidade ?");
               Disel.valorCombustivel = Teclado.nextDouble();

               Disel.mostrardados();

           }

           if (opcao == 3) {
               System.out.println("o quanto voce deseja de " + Etanol.tipoCombustivel + " ?");
               Etanol.valorPedido = Teclado.nextDouble();

               System.out.println("Qual o valor da " + Etanol.tipoCombustivel + " em sua cidade ?");
               Etanol.valorCombustivel = Teclado.nextDouble();

               Etanol.mostrardados();

           }

           System.out.println("\n\ndeseja voltar ?\n1 se sim \n2 se não");
           opcao1 = Teclado.nextInt();

           switch (opcao1) {

               case 1 :
               verificadora = true;
               break;

               case 2 :
               verificadora = false;
               break;

           }


       }
         while (verificadora);

    }
}
