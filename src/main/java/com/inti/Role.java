package com.inti;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	private String nomRole;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Utilisateur_Role",
		joinColumns = @JoinColumn(name =  "idRole"),
		inverseJoinColumns = @JoinColumn (name = "idUtilisateur"))
	private List<Utilisateur> listeUtilisateur;
	
	public Role() {
		super();
	}
	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getNomRole() {
		return nomRole;
	}
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	
	public List<Utilisateur> getListeUtilisateur() {
		return listeUtilisateur;
	}
	public void setListeUtilisateur(List<Utilisateur> listeUtilisateur) {
		this.listeUtilisateur = listeUtilisateur;
	}
	@Override
	public String toString() {
		return "Rôle [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}
	
	
}
