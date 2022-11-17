package serVivo;
import java.util.Scanner;

import java.util.ArrayList;
public class SeresVivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList animal = new ArrayList();
		
		AnimaliaFilo animaliafilo = new AnimaliaFilo();
		boolean flag = true;
		System.out.println("Escolha um reino: (1) Animalia | (2) Plantae | (3) Protista | (4) Monera | (5) Fungi | (6) Sair");
		int resposta = scan.nextInt();
		switch (resposta) {
		case 1: {
			
			
			animaliafilo.cadastrarFilo();
			animal.add(animaliafilo);
			
			System.out.println(animal);
			
		
			break;
		}
		
		case 6: {
			System.out.println("Você escolheu sair");
			flag = false;
			break;
		}
			

	}

	}
}
