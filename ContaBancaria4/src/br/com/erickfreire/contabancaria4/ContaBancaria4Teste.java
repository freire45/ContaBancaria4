package br.com.erickfreire.contabancaria4;

import java.util.Scanner;

public class ContaBancaria4Teste {

	public static void main(String[] args) {
		ContaBancaria4 conta1 = new ContaBancaria4("Maria Oliveira", 50.00);
		ContaBancaria4 conta2 = new ContaBancaria4("Joao Silva", -7.53);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor para deposito na conta 1: ");
		double deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando o valor: %.2f ao saldo da conta%n%n", deposito);
		conta1.deposito(deposito);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		System.out.print("Informe um valor para deposito na conta 2: ");
		deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando o valor: %.2f ao saldo da conta%n%n", deposito);
		conta2.deposito(deposito);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		

		System.out.print("Informe um valor para debito na conta 1: ");
		double debito = entrada.nextDouble();
		System.out.printf("%nRetirando o valor: %.2f ao saldo da conta%n%n", debito);
		conta1.debito(debito);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		System.out.print("Informe um valor para debito na conta 2: ");
		debito = entrada.nextDouble();
		System.out.printf("%nDebitando o valor: %.2f ao saldo da conta%n%n", debito);
		conta2.debito(debito);
		
		System.out.printf("o Saldo da %s é de: %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("o Saldo do %s é de: %.2f%n", conta2.getNome(), conta2.getSaldo());

	}

}
