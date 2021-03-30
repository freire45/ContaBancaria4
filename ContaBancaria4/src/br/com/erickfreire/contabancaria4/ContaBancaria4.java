package br.com.erickfreire.contabancaria4;

/**
 * Crie um prorgama que simula uma conta bancaria
 * @author Erick Freire
 * @version 1 - Criado em 30-03-2021 as 15:42
 */

public class ContaBancaria4 {
	
	private String nome;
	private double saldo;
	
	public ContaBancaria4(String nome, double saldo) {
		this.nome = nome;
		
		if(saldo > 0.0)
			this.saldo = saldo;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public String getNome() {
		return nome;
	}
	

    public void deposito(double deposito) {
    	if(deposito > 0.0)
    		saldo = saldo + deposito;
    }
    
    public double getSaldo() {
    	return saldo;
    }
    
    
    public void debito(double deb) {
    	if(deb > saldo)
    		System.out.println("Débito não aceito, saldo insufiente na conta!");
    	
    	if(deb <= saldo)
    		saldo = saldo - deb;
    	
    }

}
