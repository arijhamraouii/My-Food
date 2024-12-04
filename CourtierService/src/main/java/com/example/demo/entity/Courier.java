package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
@Entity

public class Courier implements Serializable{
private static final long serialVersionUID =1L;
	
	@Id
	private long cin;
	
	private String nom;
	
	private String telephone;
	
	private boolean disponible;

	public Courier(long cin, String nom, String telephone, boolean disponible) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.telephone = telephone;
		this.disponible = disponible;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Courier [cin=" + cin + ", nom=" + nom + ", telephone=" + telephone + ", disponible=" + disponible + "]";
	}
    
	
	
}
