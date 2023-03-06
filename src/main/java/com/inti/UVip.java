package com.inti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("2")
@Table
//@PrimaryKeyJoinColumn(name = "idU")
public class UVip extends Utilisateur {

	private double pourcentagePromo;
	private int dureeAbonnement;
	private int formule;
	private double prix;
	
	public UVip() {
		super();
	}
	
	public UVip(String login, String mdp, double pourcentagePromo, int dureeAbonnement, int formule, double prix) {
		super(login, mdp);
		this.pourcentagePromo = pourcentagePromo;
		this.dureeAbonnement = dureeAbonnement;
		this.formule = formule;
		this.prix = prix;
	}
	public double getPourcentagePromo() {
		return pourcentagePromo;
	}
	public void setPourcentagePromo(double pourcentagePromo) {
		this.pourcentagePromo = pourcentagePromo;
	}
	public int getDureeAbonnement() {
		return dureeAbonnement;
	}
	public void setDureeAbonnement(int dureeAbonnement) {
		this.dureeAbonnement = dureeAbonnement;
	}
	public int getFormule() {
		return formule;
	}
	public void setFormule(int formule) {
		this.formule = formule;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "UVip [pourcentagePromo=" + pourcentagePromo + ", dureeAbonnement=" + dureeAbonnement + ", formule="
				+ formule + ", prix=" + prix + "]";
	}
	
	
	
	
	
}
