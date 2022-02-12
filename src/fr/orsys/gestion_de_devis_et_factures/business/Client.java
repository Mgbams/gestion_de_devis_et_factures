package fr.orsys.gestion_de_devis_et_factures.business;

import java.util.ArrayList;

public class Client {

	private Long id;
	private String nom;
	private static Long compteur = 0L;
	private ArrayList<Document> documents;
	
	public Client(String nom) {
		super();
		id = ++compteur;
		this.nom = nom;
		documents = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", documents=" + documents + "]";
	}
	
	
}
