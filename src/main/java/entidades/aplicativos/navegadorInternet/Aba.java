package main.java.entidades.aplicativos.navegadorInternet;

public class Aba {

	private Integer id;
	private String titulo;
	private Boolean atualizada = false;

	public Aba() {
	}

	public Aba(Integer id,String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getAtualizada() {
		return atualizada;
	}

	public void setAtualizada(Boolean atualizada) {
		this.atualizada = atualizada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
        return "{ Aba : id= " + getId() + ", titulo= " + titulo + ", atualizada= " + atualizada + "}";
    }
}
