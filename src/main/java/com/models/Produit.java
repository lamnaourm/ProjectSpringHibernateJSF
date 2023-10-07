package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produit {

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String libelle;

	@Column
	private double prix_achat;

	@Column
	private double prix_vente;

	public Produit() {
	}

	public Produit(String libelle, double prix_achat, double prix_vente) {
		this.libelle = libelle;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}

	public double getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(double prix_vente) {
		this.prix_vente = prix_vente;
	}
}
