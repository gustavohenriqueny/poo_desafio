package main.java.entidades;

import main.java.entidades.aplicativos.Aplicativo;
import main.java.entidades.aplicativos.aparelhoTelefonico.AparelhoTelefonico;
import main.java.entidades.aplicativos.navegadorInternet.NavegadorInternet;
import main.java.entidades.aplicativos.reprodutorMusical.ReprodutorMusical;
import main.java.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Iphone {

	private Status status = Status.DESLIGADO;
	private Boolean bloqueado = true;
	private List<Aplicativo> aplicativos;

	public Iphone() {
		setStatus(Status.DESLIGADO);
		setBloqueado(true);
		setAplicativos(obterAplicativosPadroes());
	}

	private List<Aplicativo> obterAplicativosPadroes() {
		List<Aplicativo> listaAplicativosPadroes = new ArrayList<>();
		listaAplicativosPadroes.add(new AparelhoTelefonico());
		listaAplicativosPadroes.add(new NavegadorInternet());
		listaAplicativosPadroes.add(new ReprodutorMusical());
		return listaAplicativosPadroes;
	}

	public ReprodutorMusical reprodutorMusical() {
		return (ReprodutorMusical) getAplicativos()
				.stream()
				.filter(a -> a.getNome().equals("Reprodutor Musical"))
				.findFirst().orElseThrow();
	}

	public NavegadorInternet navegadorInternet() {
		return (NavegadorInternet) getAplicativos()
				.stream()
				.filter(a -> a.getNome().equals("Navegador Internet"))
				.findFirst().orElseThrow();
	}

	public AparelhoTelefonico aparelhoTelefonico() {
		return (AparelhoTelefonico) getAplicativos()
				.stream()
				.filter(a -> a.getNome().equals("Aparelho Telefonico"))
				.findFirst().orElseThrow();
	}

	public void ligar() {
		setStatus(Status.LIGADO);
		System.out.println("Iphone ligado...");
	}

	public void desligar() {
		if (getStatus() == Status.LIGADO) {
			setStatus(Status.DESLIGADO);
			System.out.println("Desligando o iphone...");
		} else {
			setStatus(Status.LIGADO);
			System.out.println("Aparelho já está desligado...");
		}
	}

	public void bloquearDesbloquear() {
		if (getStatus() == Status.LIGADO) {
			setBloqueado(!getBloqueado());
			System.out.println(getBloqueado() ? "O iphone está bloqueado..." : "O iphone está desbloqueado...");
		} else {
			System.out.println("O iphone está desligado...");
		}
	}

	public void mostrarAplicativos() {
		List<String> nomesAplicativos = new ArrayList<>();
		getAplicativos().forEach(a -> {
			nomesAplicativos.add(a.getNome());
		});
		System.out.println("Aplicativos disponíveis: " + nomesAplicativos);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public List<Aplicativo> getAplicativos() {
		return aplicativos;
	}

	public void setAplicativos(List<Aplicativo> aplicativos) {
		this.aplicativos = aplicativos;
	}
}