import java.util.*;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private int anoDeAdmissao;
	
	public double getImpostoDeRenda() {
		return 0;
	}
		

	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public int getAnoDeAdmissao() {
		return anoDeAdmissao;
	}

	public void setAnoDeAdmissao(int anoDeAdmissao) {
		this.anoDeAdmissao = anoDeAdmissao;
	}

}


