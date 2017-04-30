import com.senac.SimpleJava.Console;

public class testeClienteBanco {
	public void run() {
		
		ContaBancaria banco = new ContaBancaria();
		
		
		banco.sacar(150);
		banco.depositar(1500);
		banco.sacar(3000);
	}
}
