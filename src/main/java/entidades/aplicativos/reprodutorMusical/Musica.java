package main.java.entidades.aplicativos.reprodutorMusical;

public class Musica {

	private String nome;
	private String artista;
	private String tempoDuracao;
	private String genero;

	public Musica() {
	}

	public Musica(String nome, String artista, String tempoDuracao, String genero) {
		this.nome = nome;
		this.artista = artista;
		this.tempoDuracao = tempoDuracao;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return " { Musica : " + getNome() + ", artista: " + getArtista() + ", tempo duração: " + getTempoDuracao() + ", gênero: " + getGenero() + "}";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(String tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
