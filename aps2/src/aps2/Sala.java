package aps2;


public class Sala {
	
	private String informacoes;
	
	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public Sala(String linha)
	
	{
		setInformacoes(linha);
	}
	
}
