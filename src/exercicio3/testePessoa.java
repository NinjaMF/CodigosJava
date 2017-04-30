package exercicio3;
import java.time.LocalDate;

import com.senac.SimpleJava.Console;

public class testePessoa {
public void run() {
		
		Pessoa pessoa = new Pessoa();
		
		String idade;
		String teste;
		
		pessoa.setDataNascimento(Console.readLine("Digite sua data de nascimento AAAA-MM-DD:"));

		//Console.println(pessoa.getDataNascimento());
		
		//teste = pessoa.getDataNascimento();
		
		Console.println(pessoa.calculaIdade(pessoa.getDataNascimento()));
		
		//idade = calculaIdade();
		
		Console.print(pessoa.Signo(pessoa.getDataNascimento()));
	}

}
