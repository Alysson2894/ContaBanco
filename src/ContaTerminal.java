import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        System.out.println();
        System.out.println("###### Seja bem vindo ao Banco do Povo ######");
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Digite os seus dados conforme solicitado para acessar sua conta");
        System.out.println("***************************************************************");
        System.out.println();
        System.out.print("NOME DO CLIENTE: ");
        nomeCliente = entradaDados.nextLine();
        System.out.print("AGENCIA: ");
        agencia = entradaDados.nextLine();
        System.out.print("NUMERO: ");
        numero = entradaDados.nextInt();
        System.out.print("SALDO: ");
        saldo = entradaDados.nextDouble();

        System.out.println();
        System.out.println("NOME DO CLIENTE: " + nomeCliente);
        System.out.println("AGENCIA: " + agencia);
        System.out.println("NUMERO: " + numero);
        System.out.println("SALDO: " + saldo);
        System.out.println();



    }
}

