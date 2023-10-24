package autenticaçao;

import java.util.Scanner;

public class ExibirAtributos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		
		//recebendo os dados:
		String nome = tec.nextLine(); 
		
		//pedindo ao usuario inserir o seu cpf
		System.out.println("Digite o seu cpf: ");
	
		//recebendo os dados:
		String cpf = tec.nextLine(); 
			
		//pedindo ao usuario inserir o seu sexo
		System.out.println("Digite o seu sexo: ");
	
		//recebendo o sexo:
		String sexo = tec.nextLine(); 
			
		//pedindo ao usuario inserir a sua idade
		System.out.println("Digite a sua idade: ");
	
		//recebendo a idade:
		int idade = tec.nextInt();
		tec.nextLine();
		
		System.out.println("Digite a sua matricula: ");
		
		String matricula = tec.nextLine();
		
		System.out.println("Digite o seu IRA: ");

		double IRA = tec.nextDouble(); 
		tec.nextLine();
		
		System.out.println("Digite o valor da sua bolsa: ");

		int valorBolsa = tec.nextInt();
		tec.nextLine();
		
		System.out.println("Digite o nome do seu projeto: ");
		
		String nomeProjeto = tec.nextLine();
		
		System.out.println("Digite a senha:");
		String senha = tec.nextLine();

		Bolsista dados = new Bolsista (nome, matricula, idade, sexo, cpf, IRA, valorBolsa, nomeProjeto);
		
		dados.ExibirTotal();
		tec.close();
		dados.AutenticarSUAP(senha);
	}

}

