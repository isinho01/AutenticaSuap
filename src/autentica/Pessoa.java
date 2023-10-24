package autentica;

//declarando a classe pessoa 
public class Pessoa{

 private String nome, cpf, sexo;

 private  int idade;


//construtor sem par�mentro, construtor vazio e declarando os atributos vazios
 public Pessoa(){

     this.nome = " ";

     this.cpf = " ";

     this.sexo = " ";

     this.idade = -1;

 }


//construtor com par�mentros e declarando os atributos "vazio"
 public Pessoa(String nome, String cpf, String sexo, int idade){

     this.nome = nome;

     this.cpf = cpf;

     this.sexo = sexo;

     this.idade = idade; 
     
     if(validarIdade(idade)) {

 		this.idade = idade;

 	}
 }
 
//verifica��o de idade com m�todo    		
//testando o boolean (if or else) 
 
 private boolean validarIdade(int idade){

		return (idade > 0 && idade < 120);

	}
//encapsulamento das vari�veis da classe
 	public void setNome(String nome) {
		this.nome = nome;
	}

 	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public boolean setIdade(int idade) {

		if(validarIdade(idade)) {

			this.idade = idade;

			return true;

		}

		return false;

	}	
	
//metodo printDados, printando todos os dados que o usu�rio inserir
 public void PrintDados() {
 	System.out.println("nome: " + this.nome);
 	System.out.println("CPF: " + this.cpf);  
 	System.out.println("sexo: " + this.sexo);
 	System.out.println("idade: " + this.idade);
 }
}