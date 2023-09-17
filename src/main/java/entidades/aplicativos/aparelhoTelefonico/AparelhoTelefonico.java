package main.java.entidades.aplicativos.aparelhoTelefonico;

import main.java.entidades.aplicativos.Aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AparelhoTelefonico extends Aplicativo {

	private List<Contato> contatos;
	private Boolean ligacao;

	public AparelhoTelefonico() {
		super("Aparelho Telefonico");
		setContatos(obterContatos());
		setLigacao(true);
	}

	public void mostrarContatos() {
		System.out.println("Contatos : " + getContatos());
	}

	public void ligar(String nome) {
		getContatos().forEach(contato -> {
			if (contato.getNome().equals(nome)) {
				setLigacao(true);
				System.out.println("Ligando para " + contato.getNome());
			}
		});
	}

	public void atender(String nome) {
		getContatos().forEach(contato -> {
			if (contato.getNome().equals(nome)) {
				setLigacao(true);
				System.out.println("Atendendo ligação de " + contato.getNome());
			} else {
				System.out.println("O contato mencionado não existe...");
			}
		});
	}

	private List<Contato> obterContatos() {
		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(new Contato("Gustavo", 999999999, 31));
		contatos.add(new Contato("Junin", 999999998, 31));
		contatos.add(new Contato("Douglas", 999999910, 31));
		return contatos;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Boolean getLigacao() {
		return ligacao;
	}

	public void setLigacao(Boolean ligacao) {
		this.ligacao = ligacao;
	}
}
