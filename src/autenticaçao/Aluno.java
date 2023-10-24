package autenticaçao;

public class Aluno extends Pessoa implements AutenticarSuap{
	String matricula;
	double IRA;

//construtor de aluno	
	public Aluno(String nome, String matricula, int idade, String sexo, String cpf, double IRA) {
		super(nome, cpf, sexo, idade);
		this.matricula = matricula;
		this.IRA = IRA;
	}
	
//encapsulamento de vari veis de aluno
	public String getMatricula() {
		return matricula;
}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	// pegar dados (get)
	public double getIRA() {
		return IRA;
	}
	// soltar um novo valor a variavel 
	public void setIRA(int iRA) {
		IRA = iRA;
	}
	
	// teste de senha 
	
	public void AutenticarSUAP(String senha) {
		if (senha.equals("Info2m")){
			System.out.println("Usuario Autenticado!");
			}
			else {
				System.out.println("Usuario nao autenticado!");
			}
		}
	public void ExibirDados() {
		System.out.println("matricula: " + this.matricula);
		System.out.println("IRA: " + this.IRA);
	 }
	
}
