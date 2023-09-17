package main.java.entidades.aplicativos.reprodutorMusical;

import main.java.entidades.aplicativos.Aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReprodutorMusical extends Aplicativo {

	private List<Musica> musicas;
	private Boolean tocando = false;
	private Musica musicaAtual = new Musica();

	public ReprodutorMusical() {
		super("Reprodutor Musical");
		setMusicas(obterMusicas());
	}

	private List<Musica> obterMusicas() {
		List<Musica> musicas = new ArrayList<>();
		Musica flydayChinatown = new Musica("Flyday Chinatown", "Yasuha", "03:30", "POP Japones");
		Musica hitTheRoadJack = new Musica("HitTheRoadJack", "Ray Charles", "02:03", "R&B/Soul");
		Musica help = new Musica("Help", "The Beatles", "02:19", "Rock");
		musicas.add(flydayChinatown);
		musicas.add(hitTheRoadJack);
		musicas.add(help);
		return musicas;
	}

	public void mostrarMusicas() {
		System.out.println("Músicas : " + musicas);
	}

	public void tocarMusica() {
		tocandoMusica(true);
		System.out.println("Música tocando...");
	}

	private void tocandoMusica(Boolean estado) {
		setTocando(estado);
	}

	public void pausarMusica() {
		if (tocando) {
			tocandoMusica(false);
			System.out.println("Música pausada...");
		} else {
			System.out.println("A música já está pausada...");
		}
	}

	public void selecionarMusica(String nome) {
		for (Musica musica : musicas) {
			if (musica.getNome().equals(nome)) {
				setMusicaAtual(musica);
				System.out.println("Música selecionada : " + musica.getNome());
				return;
			}
		}
	}

	public void mostrarMusicaAtual() {
		if (tocando) {
			System.out.println("Música atual : " + musicaAtual);
		} else {
			System.out.println("A música está pausada, música selecionada : " + musicaAtual.getNome());
		}
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Boolean getTocando() {
		return tocando;
	}

	public void setTocando(Boolean tocando) {
		this.tocando = tocando;
	}

	public Musica getMusicaAtual() {
		return musicaAtual;
	}

	public void setMusicaAtual(Musica musicaAtual) {
		this.musicaAtual = musicaAtual;
	}
}
