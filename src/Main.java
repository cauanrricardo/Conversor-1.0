import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ConversorInterface c1 = new Conversor();

        // Interface, com um menu de escolhas
        System.out.println("Escolha uma conversão:");
        System.out.println("1 - Decimal para Binário");
        System.out.println("2 - Binário para Decimal");
        int escolha = teclado.nextInt();

        //Se for decimal pra binario
        if (escolha == 1) {
            System.out.print("Digite um número decimal: ");
            int numero = teclado.nextInt();
            c1.decimaltobinario(numero);
            //se for binario pra decimal
        } else if (escolha == 2) {
            System.out.print("Digite um número binário: ");
            String binario = teclado.next();
            c1.binariotodecimal(binario);
            //se for nenhuma das opcoes
        } else {
            System.out.println("Opção inválida!");
        }
    }
}

