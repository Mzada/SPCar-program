package MatheusAlves_Ag04_DSI;

import java.util.Scanner;

/**
 * SPCar
 */
public class SPCar {

    /**
     * 
     */
    public static void main(String[] args) {
        // Scanner para realizar leitura de dados
        Scanner sc = new Scanner (System.in);
        System.out.println("SPCar Locadora de veiculos\n");

        //entrada de dados

        //Para escrever o modelo do carro
        System.out.println("Qual modelo do carro desejado?");   
        String modelo = sc.nextLine();

        //Para escrever o valor da diaria
        System.out.println("Valor da diaria?");
        Float valor = sc.nextFloat();

        //Para escrever a quantidade de dias usados
        System.out.println("Quantidade de dias usados?");
        int dias = sc.nextInt();

        //Para escrever a quantidade de KM percorridos
        System.out.println("Quantidade de KM percorridos?");
        int kmRodado = sc.nextInt();
        
        //Calculo do preço total
        double valorTotal = valor * dias + (kmRodado * 0.2);
        
        //Exibição Modelo e Valor Total
        System.out.println("Modelo: \n" + modelo);
        System.out.println("Valor total: \nR$" + valorTotal);

        //fechar scanner
        sc.close();

            }

}