package rest.exer7;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {
	private String nome;
	private Integer idade;
	private BigDecimal salario;
	
	public Pessoa() {
		
	}
	
	
	
	public Pessoa(String nome, Integer idade, BigDecimal salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	

}
