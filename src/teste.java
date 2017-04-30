import com.senac.SimpleJava.Console;

public class teste {

	public void run() {
		
		
		circulo cir1 = new circulo();
		circulo cir2 = new circulo();
		
		double distancia;
		double encosta;

		cir1.setRaio(Console.readDouble("Digite o raio 1:"));
		cir2.setRaio(Console.readDouble("Digite o raio 2:"));
		distancia = Console.readDouble("Digite a distancia");
		
		Console.println("Area circulo 1"+cir1.area());
		Console.println("Circunferencia circulo 1"+cir1.circunferencia());
		
		Console.println("Area circulo 2"+cir2.area());
		Console.println("Circunferencia circulo 2"+cir2.circunferencia());
	   
		encosta = cir1.distancia(distancia, cir1.getRaio(), cir2.getRaio());
	    
		
		if(encosta == 0) {
			Console.println("Estao afastados");
			
		} 
		if(encosta == 1) {
			Console.println("Estao em contato");
			
		}
			
		
	}
	
}
