package main.java.entidades.aplicativos.aparelhoTelefonico;

public class Contato {

	private String nome;
	private Integer numeroTelefone;
	private Integer ddd;

	public Contato() {
    }

	public Contato(String nome, Integer numeroTelefone, Integer ddd) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.ddd = ddd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	@Override
	public String toString() {
		return "{ Contato: nome= " + getNome() + ", telefone= " + getNumeroTelefone() + ", DDD= " + getDdd();
	}
}
