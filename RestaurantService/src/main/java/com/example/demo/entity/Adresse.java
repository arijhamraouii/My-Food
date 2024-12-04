package com.example.demo.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Adresse implements Serializable{
	private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String nom;
    private String rue;
    private String cite;
    private String ville;
    
    
	public Adresse(Long id, String numero, String nom, String rue, String cite, String ville) {
		super();
		this.id = id;
		this.numero = numero;
		this.nom = nom;
		this.rue = rue;
		this.cite = cite;
		this.ville = ville;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCite() {
		return cite;
	}


	public void setCite(String cite) {
		this.cite = cite;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numero=" + numero + ", nom=" + nom + ", rue=" + rue + ", cite=" + cite
				+ ", ville=" + ville + "]";
	}

	
}
