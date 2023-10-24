package autenticaçao;


public class Bolsista extends Aluno{
		
		int valorBolsa;
		String nomeProjeto;
		
//construtor de bolsista
		public Bolsista(String nome, String matricula, int idade, String sexo, String cpf, double IRA, int valorBolsa, String nomeProjeto) {
			super(nome, matricula, idade, sexo, cpf, IRA);
			this.valorBolsa = valorBolsa;
			this.nomeProjeto = nomeProjeto;
		}

//encapsulamento de variaveis de bolsista
		public int getValorBolsa() {
			return valorBolsa;
		}
		public String getNomeProjeto() {
			return nomeProjeto;
		}
		
		public void MostrarDados() {
	    	System.out.println("valor da bolsa: " + this.valorBolsa);
	    	System.out.println("nome do projeto: " + this.nomeProjeto);
		}	
		public void ExibirTotal() {
			super.PrintDados();
	    	super.ExibirDados();
	    	this.MostrarDados(); 
		}
}
