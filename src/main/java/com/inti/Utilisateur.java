package com.inti;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "discriminator", discriminatorType = DiscriminatorType.INTEGER)
//@DiscriminatorValue("0")
public abstract class Utilisateur {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idUtilisateur;
	private String login;
	private String mdp;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUD", nullable = false)
//	@JoinTable(name = "Utilisateur_UtilisateurDetails",
//		joinColumns = @JoinColumn(name =  "idUtilisateur"),
//		inverseJoinColumns = @JoinColumn (name = "idUtilisateurDetails"))
	private UtilisateurDetails utilisateurDetails;
	
	@OneToMany(mappedBy = "utilisateur", targetEntity = Commande.class)
	private List<Commande> listeCommande;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Utilisateur_Role",
		joinColumns = @JoinColumn(name =  "idUtilisateur"),
		inverseJoinColumns = @JoinColumn (name = "idRole"))
	private List<Role> listeRole;
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public UtilisateurDetails getUtilisateurDetails() {
		return utilisateurDetails;
	}
	public void setUtilisateurDetails(UtilisateurDetails utilisateurDetails) {
		this.utilisateurDetails = utilisateurDetails;
	}
	
	public List<Commande> getListeCommande() {
		return listeCommande;
	}
	public void setListeCommande(List<Commande> listeCommande) {
		this.listeCommande = listeCommande;
	}
	
	public List<Role> getListeRole() {
		return listeRole;
	}
	public void setListeRole(List<Role> listeRole) {
		this.listeRole = listeRole;
	}
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", login=" + login + ", mdp=" + mdp
				+ ", utilisateurDetails=" + utilisateurDetails + "]";
	}
	
	
	
}
