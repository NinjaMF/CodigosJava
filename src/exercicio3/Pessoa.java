package exercicio3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;

import com.senac.SimpleJava.Console;

public class Pessoa {

	public String nome;
	public String dataNascimento;
	public int idade;
	public String signo;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	
	public String calculaIdade(String argumentoData) {
		LocalDate localDate = LocalDate.now();
		
		//LocalDate dataNascimento = LocalDate.of(1994, 4, 9);
		
	//	String dataNascimentoUsuario = "1984/04/09";
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/DD");
		
//		LocalDate dataNascimento = LocalDate.parse(dataNascimentoUsuario, formatter);
		
		 //dataNascimento = dataNascimentoUsuario; 
//		LocalDate idade;
		
//		Period period = Period.between(localDate, dataNascimento);
				
				
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
//		String data = period.toString();
		
		//Console.print(data);
//		return data;
       //String dataTeste = "2010-04-28";
		String dataTeste = argumentoData;	
		LocalDate dataNascimento = LocalDate.parse(dataTeste); 
		Period period = Period.between(localDate, dataNascimento);
		int ano;
		
		ano =period.getYears();
		
		//String data = period.toString();
	
		// Console.println(ano + "anos" + period.getMonths() + "mes" + period.getDays() + "dias");
		String data = ("idade : " + period.getYears() +  " anos  " + period.getMonths() + "  meses   " + period.getDays() + "  dias");
		
		return data;
	
	}
	
	
	public String Signo(String argumentoData) {
		
		String dataTeste = argumentoData;	
		LocalDate dataNascimento = LocalDate.parse(dataTeste); 
		Month mes;
		int diaMes;
		int diaAno;
		
//		Áries - 21 de Março – 19 de Abril 
//		Touro - 20 de Abril – 20 de Maio 
//		Gêmeos - 21 de Maio – 20 de Junho 
//		Câncer - 21 de Junho – 22 de Julho 
//		Leão - 23 de Julho – 22 de Agosto 
//		Virgem - 23 de Agosto – 22 de Setembro 
//		Libra - 23 de Setembro – 22 de Outubro 
//		Escorpião - 23 de Outubro – 21 de Novembro 
//		Sagitário - 22 de Novembro – 21 de Dezembro 
//		Capricórnio - 22 de Dezembro – 19 de Janeiro 
//		Aquário - 20 de Janeiro – 18 de Fevereiro 
//		Peixes - 19 de Fevereiro – 20 de Março
		
		mes = dataNascimento.getMonth();
		 diaMes = dataNascimento.getDayOfMonth();
		 
		//return mes.toString(); 
		//return  Integer.toString(diaMes);
		 
		 if (((dataNascimento.getMonth().toString() == "MARCH") && (diaMes >=21)) || ((dataNascimento.getMonth().toString() == "APRIL") && (diaMes <=19))) {
		
			 return "Aries";
		 
		 }  
		 
		 if (((dataNascimento.getMonth().toString() == "APRIL") && (diaMes >=20)) || ((dataNascimento.getMonth().toString() == "MAY") && (diaMes <=22))) {
				
			 return "Touro";
		 
		 } 
		 
		 if (((dataNascimento.getMonth().toString() == "MAY") && (diaMes >=21)) || ((dataNascimento.getMonth().toString() == "JUNE") && (diaMes <=20))) {
				
			 return "Gemeos";
		 
		 }
		 

		 if (((dataNascimento.getMonth().toString() == "JUNE") && (diaMes >=21)) || ((dataNascimento.getMonth().toString() == "JULY") && (diaMes <=22))) {
				
			 return "Câncer";
		 
		 } 
		 
		 if (((dataNascimento.getMonth().toString() == "JULY") && (diaMes >=23)) || ((dataNascimento.getMonth().toString() == "AUGUST") && (diaMes <=22))) {
				
			 return "Leão";
		 
		 } 
		 
		 if (((dataNascimento.getMonth().toString() == "AUGUST") && (diaMes >=23)) || ((dataNascimento.getMonth().toString() == "SEPTEMBER") && (diaMes <=22))) {
				
			 return "Virgem";
		 
		 } 
		 
		 if (((dataNascimento.getMonth().toString() == "SEPTEMBER") && (diaMes >=23)) || ((dataNascimento.getMonth().toString() == "OCTOBER") && (diaMes <=22))) {
				
			 return "Libra";
		 
		 }
		 
		 if (((dataNascimento.getMonth().toString() == "OCTOBER") && (diaMes >=23)) || ((dataNascimento.getMonth().toString() == "NOVEMBER") && (diaMes <=21))) {
				
			 return "Escorpião";
		 
		 }
		 
		 if (((dataNascimento.getMonth().toString() == "NOVEMBER") && (diaMes >=22)) || ((dataNascimento.getMonth().toString() == "DECEMBER") && (diaMes <=21))) {
				
			 return "Sagitário";
		 
		 }
		 
		 if (((dataNascimento.getMonth().toString() == "DECEMBER") && (diaMes >=22)) || ((dataNascimento.getMonth().toString() == "JANUARY") && (diaMes <=19))) {
				
			 return "Capricórnio";
		 
		 }
		 
		 
		 if (((dataNascimento.getMonth().toString() == "JANUARY") && (diaMes >=20)) || ((dataNascimento.getMonth().toString() == "FEBRUARY") && (diaMes <=18))) {
				
			 return "Aquário";
		 
		 }
		 
		 
		 if (((dataNascimento.getMonth().toString() == "FEBRUARY") && (diaMes >=19)) || ((dataNascimento.getMonth().toString() == "MARCH") && (diaMes <=20))) {
				
			 return "Peixes";
		 
		 }
		    // Console.print(dataNascimento.getMonth().toString());
		
		return "erro"; 
	}
	
}


