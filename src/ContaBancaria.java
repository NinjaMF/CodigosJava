import com.senac.SimpleJava.Console;

public class ContaBancaria {

	public double saldo = 1500;
	public String numeroConta;
	private Cliente titular;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getTitular() {
		if(titular == null) titular = new Cliente();
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			Console.println("Foi sacado:" + valor);
			Console.println("Seu novo saldo é de:" + saldo);
		} else {
			Console.print("Saldo Insuficiente");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		
		Console.println("Foi depositado o valor de: " + valor);
		Console.println("Seu novo saldo é de:" + saldo);
	}
	
	
	
	
}
