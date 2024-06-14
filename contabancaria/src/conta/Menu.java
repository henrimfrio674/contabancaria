package conta;

import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int numero = ler.nextInt();

        System.out.print("Informe a agência: ");
        int agencia = ler.nextInt();

        int tipo = 0;
        while (tipo != 1 && tipo != 2) {
            System.out.print("Informe o tipo (1 para Conta Corrente, 2 para Conta Poupança): ");
            tipo = ler.nextInt();
        }

        ler.nextLine();
        System.out.print("Informe o titular: ");
        String titular = ler.nextLine();

        System.out.print("Informe o depósito: ");
        float deposito = ler.nextFloat();

        if (tipo == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(numero, agencia, tipo, titular, deposito, 0);

            System.out.println("\nDados bancários:");
            System.out.println("Número: " + contaCorrente.getNumero());
            System.out.println("Agência: " + contaCorrente.getAgencia());
            System.out.println("Tipo: " + contaCorrente.getTipo());
            System.out.println("Titular: " + contaCorrente.getTitular());
            System.out.println("Saldo: " + contaCorrente.getSaldo());
            System.out.println("Limite: " + contaCorrente.getLimite());

            System.out.print("\nInforme o saque: ");
            float sacar = ler.nextFloat();

            contaCorrente.sacar(sacar);
            System.out.println("Saldo após saque: " + contaCorrente.getSaldo());
        } else {
            ContaPoupanca contaPoupanca = new ContaPoupanca(numero, agencia, tipo, titular, deposito);

            System.out.println("\nDados bancários:");
            System.out.println("Número: " + contaPoupanca.getNumero());
            System.out.println("Agência: " + contaPoupanca.getAgencia());
            System.out.println("Tipo: " + contaPoupanca.getTipo());
            System.out.println("Titular: " + contaPoupanca.getTitular());
            System.out.println("Saldo: " + contaPoupanca.getSaldo());
            System.out.print("Informe o depósito: ");
            deposito = ler.nextFloat();
            contaPoupanca.depositar(deposito);
        }
    }
}
