package main.java.entidades.aplicativos.navegadorInternet;

import main.java.entidades.aplicativos.Aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NavegadorInternet extends Aplicativo {

	private List<Aba> abas = new ArrayList<>();

	public NavegadorInternet() {
		super("Navegador Internet");
	}

	public void exibirAbas() {
		if (!abas.isEmpty()) {
			getAbas().forEach(System.out::println);
		} else {
			System.out.println("Não existem abas no momento...");
		}
    }

	public void exibirAba(String titulo) {
		getAbas().forEach(aba -> {
            if (Objects.equals(aba.getTitulo(), titulo)) {
                System.out.println("Abas : " + titulo);
            }
        });
	}

	public void adicionarNovaAba(Integer id,String titulo) {
		getAbas().add(new Aba(id,titulo));
		System.out.println("Aba adicionada : " + titulo);
	}

	public void atualizarPagina(String titulo) {
		getAbas().forEach(aba -> {
			if (Objects.equals(aba.getTitulo(), titulo)) {
				aba.setAtualizada(true);
				System.out.println("Aba atualizada : " + titulo);
			}
		});
	}

	public List<Aba> getAbas() {
		return abas;
	}

	public void setAbas(List<Aba> abas) {
		this.abas = abas;
	}
}
