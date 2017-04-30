package exercicio4;
import com.senac.SimpleJava.Console;

public class testeTemperatura {

	
	public void run() {
	
		temperatura temp = new temperatura();
		String escala;
		
		 escala = Console.readLine(("Digite a escala de temperatura de entrada: C[Celsius] / F[Fahrenheit] :"));
		temp.setTemperatura(Console.readLine(("Digite a temperatura:")));
		 
		//Console.print(temp.converte(temp.getTemperatura()));
		 Console.print(temp.converte(temp.getTemperatura(), escala));
		 
	}
}
