package com.michal;

import java.util.UUID;

public class Uzytkownik {
	private String login;
	private String haslo;
	private UUID Zeton = UUID.randomUUID();

	public Uzytkownik() {
	}

	public Uzytkownik(String login, String haslo) {
		this.login = login;
		this.haslo = haslo;

	}

	public UUID getZeton() {
		return Zeton;
	}

	public void setZeton(UUID Zeton) {
		this.Zeton = Zeton;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	// @Override
	// public String toString() {
	// return "ExampleModel{" + "string='" + login + '\'' + ", anInt=" + haslo
	// + + '}';
	// }

}