package fr.orsys.gestion_de_devis_et_factures.business;

import java.util.ArrayList;
import java.util.Date;

public abstract class Document {

	private Client client;
	private ArrayList<Ligne> lignes;
	private Date dateDeCreation;

	// Constructeur par défaut
	public Document() {
		lignes = new ArrayList<>();
		dateDeCreation = new Date();
	}
	
	// Constructeur avec un paramètre de type Client
	public Document(Client client) {
		this();
		//Le this ci-dessous lève l'ambiguité (entre le paramètre et l'attribut)
		this.client = client;
		// On ajoute le document en cours de création (this) à la liste des documents du client donné en paramètre
		client.getDocuments().add(this);
	}

	public Document(Client client, Date dateDeCreation) {
		this(client);
		this.dateDeCreation = dateDeCreation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Ligne> getLignes() {
		return lignes;
	}

	public void setLignes(ArrayList<Ligne> lignes) {
		this.lignes = lignes;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public float getTotal() {
		float total = 0;
		for (Ligne ligne : lignes) {
			float remise = 0;
			if (ligne.getRemise()!=null) {
				remise = ligne.getRemise();
			}
			total += ligne.getArticle().getPrix()*ligne.getQuantite()*(1-remise);
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "Document [client=" + client + ", lignes=" + lignes + ", dateDeCreation=" + dateDeCreation + "]";
	}
	
}