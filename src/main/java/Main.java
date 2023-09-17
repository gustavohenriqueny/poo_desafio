package main.java;

import main.java.entidades.Iphone;
import main.java.entidades.aplicativos.aparelhoTelefonico.AparelhoTelefonico;

public class Main {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar();
		iphone.bloquearDesbloquear();
		iphone.mostrarAplicativos();

//		Reprodutor músical...
		iphone.reprodutorMusical().mostrarMusicas();
		iphone.reprodutorMusical().selecionarMusica("Flyday Chinatown");
		iphone.reprodutorMusical().tocarMusica();
		iphone.reprodutorMusical().mostrarMusicaAtual();
		iphone.reprodutorMusical().pausarMusica();

//		Aparelho Telefonico
//		iphone.aparelhoTelefonico().mostrarContatos();
//		iphone.aparelhoTelefonico().ligar("Gustavo");
//		iphone.aparelhoTelefonico().atender("Macedo");

//		Navegador na Internet
//		iphone.navegadorInternet().exibirAbas();
//		iphone.navegadorInternet().adicionarNovaAba(1, "Internet");
//		iphone.navegadorInternet().adicionarNovaAba(2, "Google");
//		iphone.navegadorInternet().atualizarPagina("Google");
//		iphone.navegadorInternet().exibirAbas();

		iphone.desligar();
	}
}
