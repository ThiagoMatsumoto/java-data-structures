package circular_linked_list;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ListaCircular lc = new ListaCircular();

        System.out.println("Quantos valores deseja inserir?");
        int n = scanner.nextInt();
        System.out.println("Digite os valores que deseja inserir:");

        for(int i = 0; i < n; i++){
            int valor = scanner.nextInt();
            lc.inserir(valor);
        }
        scanner.close();
        
        System.out.println();
        lc.imprime();

        lc.inverte();
        System.out.println();
        lc.imprime();
    }
}
