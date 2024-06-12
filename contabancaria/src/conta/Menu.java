package conta;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		Scanner ler = new Scanner(System.in);
		
        System.out.print("informa o numero: ");
        int numero = ler.nextInt();
        
        System.out.print("informa a agencia: ");
        int agencia = ler.nextInt();
        
        System.out.print("informa o tipo: ");
        int tipo = ler.nextInt();
        
        ler.nextLine();
        System.out.print("informa o titular: ");
        String titular  = ler.nextLine();
        
        System.out.print("informa deposito: ");
        double deposito = ler.nextDouble();
        
        conta.setNumero(numero);
		conta.setAgencia(agencia);
		conta.setTipo(tipo);
		conta.setTitular(titular);
		conta.depositar(deposito);
		
		System.out.println("\n Dados bancarios :");
		System.out.println("\n Numero: "+conta.getNumero());
		System.out.println("\n Agencia: "+conta.getAgencia());
		System.out.println("\n Tipo: "+conta.getTipo());
		System.out.println("\n Titular: "+conta.getTitular());
		System.out.println("\n Saldo: "+conta.getSaldo());
		
		
	}

}
