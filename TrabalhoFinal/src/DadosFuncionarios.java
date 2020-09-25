import java.util.*;

public class DadosFuncionarios {
	public static void main(String[] args) {
		System.out.println("Quantos funcion�rios deseja cadastrar? ");
		int i;
		int qtd = new Scanner(System.in).nextInt();
		Funcionario [] profissionais = new Funcionario [qtd];
		for (i = 0; i <qtd ;i++) {
			System.out.println("O novo funcion�rio � Professor (p) ou Diretor (d)");
			char tipo = new Scanner(System.in).next().charAt(0);
			if (tipo == 'p' || tipo =='P') {
				profissionais[i] = new Professor();
				System.out.println("Por favor digite o nome do profissional: ");
				profissionais[i].setNome(new Scanner(System.in).nextLine());
				System.out.println("Por favor digite o CPF do profissional: ");
				profissionais[i].setCpf(new Scanner(System.in).nextLine());
				System.out.println("Por favor digite o Sal�rio do profissional: ");
				profissionais[i].setSalario(new Scanner(System.in).nextDouble());
				System.out.println("Por favor digite o ano de admiss�o do profissional: ");
				profissionais[i].setAnoDeAdmissao(new Scanner(System.in).nextInt());
				profissionais[i].getImpostoDeRenda();
			}else {
				profissionais[i] = new Diretor();
				System.out.println("Por favor digite o nome do profissional: ");
				profissionais[i].setNome(new Scanner(System.in).nextLine());
				System.out.println("Por favor digite o CPF do profissional: ");
				profissionais[i].setCpf(new Scanner(System.in).nextLine());
				System.out.println("Por favor digite o Sal�rio do profissional: ");
				profissionais[i].setSalario(new Scanner(System.in).nextDouble());
				System.out.println("Por favor digite o ano de admiss�o do profissional: ");
				profissionais[i].setAnoDeAdmissao(new Scanner(System.in).nextInt());
				profissionais[i].getImpostoDeRenda();
			}
		}
		
		double soma = 0;
		for (i = 0; i<qtd; i++) {
			soma = soma + profissionais[i].getImpostoDeRenda();
		}
		System.out.println("A soma de todos os sal�rios � iqual a R$ " + soma);
		System.out.println("A m�dia de todos os sal�rios � iqual a R$ " + (soma/qtd));
		
	}
	
	
}
