package main.java.enums;

public enum Status {

	LIGADO(true, "Ligado"),
	DESLIGADO(false, "Desligado");

	private Boolean status;
	private String descricao;

	private Status(boolean status, String descricao) {
        this.status = Boolean.valueOf(status);
        this.descricao = descricao;
    }

}
