package aps2;
import java.io.File;
import java.util.Scanner;

import com.senac.SimpleJava.Console;

public class laberinto {



		public void run()
		{
			Sala[] vetorSalas = new Sala[32];
			int indiceVetor = 1;
			Scanner sc = new Scanner(System.in);		
			File file = new File("laberinto.txt");
			try{
				Scanner sc2 = new Scanner(file);
				while(sc2.hasNextLine())
				{
					Sala sala = new Sala(sc2.nextLine());
					vetorSalas[indiceVetor] = sala;
					///Console.print(indiceVetor);
					//Console.print(sala.getInformacoes());
					indiceVetor++;
				}
			}
			catch(Exception e)
			{
				Console.println("ERRO: " + e.getMessage());
			}
			
			
			while(true)
			{
				try
				{
					Console.print("\nQual sala deseja visualizar? ");
					int salaNum = Integer.parseInt(sc.nextLine());
					Console.println(vetorSalas[salaNum].getInformacoes());
				}
				catch(Exception e)
				{
					Console.println("Erro! Tente novamente.");
				}
				
			}
		}

		
	}



