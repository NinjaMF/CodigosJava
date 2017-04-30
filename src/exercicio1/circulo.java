package exercicio1;

public class circulo {
	
	private double raio;
	private double area;
	private double circunferencia;
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public double area() {
		
		area = (raio*raio)*Math.PI;
		return area;
	}

	public double circunferencia() {
		
		circunferencia = 2*Math.PI*raio;
		return circunferencia;
	}

	
	public double distancia(double distancia, double x, double y) {
		
		if (distancia > x + y) {
			return 0; 
						
		} 
		
		if (distancia == x + y) {
			return 1; 
						
		} 
		
		return 2;
		
	}
}
