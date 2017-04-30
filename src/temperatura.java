
public class temperatura {
	
	public String temperatura;

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	
	public String converte(String temperatura, String escala) {
		double c = 0;
		double f;
		
		if(escala.equals("C")) {
			
			f = (Double.parseDouble(temperatura) * 1.8) + 32;
			
			
			return Double.toString(f) + "  Fahrenheit" ;
			
		} else if (escala.equals("F")) {
			
			c = (Double.parseDouble(temperatura)-32)/1.8;
			
			return Double.toString(c) + "  Celsius";
		}
		
		
		
		return "ERRO NAO CADASTRADO!";
		
	}
}
