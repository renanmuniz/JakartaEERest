package rest.exer9;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Titulo {
	private String sacado;
	private Double valor;
	
	public Titulo() {
	
	}

	public Titulo(String sacado, double valor) {
		super();
		this.sacado = sacado;
		this.valor = valor;
	}

	public void validar() throws NegocioException {
		String erros = "";
		
		if(sacado == null) {
			erros += "Sacado � obrigat�rio";
		}
		if(valor == null) {
			erros += "Valor � obrigat�rio";
		}
		if(!erros.isEmpty()) {
			throw new NegocioException(erros);
		}
	}
	
	
	public String getSacado() {
		return sacado;
	}

	public void setSacado(String sacado) {
		this.sacado = sacado;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Titulo [sacado=" + sacado + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sacado == null) ? 0 : sacado.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		if (sacado == null) {
			if (other.sacado != null)
				return false;
		} else if (!sacado.equals(other.sacado))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	

}
