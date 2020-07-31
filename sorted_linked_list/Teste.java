package sorted_linked_list;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        /**
         * a cada inteiro lido, insira-o no lugar adequado na lista.
         */
        
        Scanner scanner = new Scanner(System.in);
        ListaSimplesOrdenada lso = new ListaSimplesOrdenada();

        System.out.println("Quantos numeros deseja inserir?");
        int valor = scanner.nextInt();
        System.out.println("Digite os valores que deseja inserir:");
        
        for(int i = 0; i < valor; i++){
            int num = scanner.nextInt();
            lso.insere(num);
        }
        scanner.close();
        System.out.println();
        lso.imprime();
        
    }
}
