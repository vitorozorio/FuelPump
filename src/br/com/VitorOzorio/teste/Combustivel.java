package br.com.VitorOzorio.teste;
public class Combustivel {

   String tipoCombustivel;
   double valorCombustivel;
   double valorPedido;


    public void mostrardados() {
        System.out.println("cumbustivel escolhido :" + tipoCombustivel);
        System.out.printf("calculo do rendimento  : %.2f", (valorPedido/valorCombustivel) );
        System.out.print(" litros ");
    }

}
