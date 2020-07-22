package rest.exer8;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Funcionario {
	private String nome;
	private long cpf;
	private BigDecimal salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	

}
