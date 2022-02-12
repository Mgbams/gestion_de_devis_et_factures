package fr.orsys.gestion_de_devis_et_factures.business;

import java.util.Date;

public class Devis extends Document {

	private Date dateDeValidite;
	private Long reference;
	private static Long compteur = 0L;
	
	public Devis(Date dateDeValidite) {
		super();
		this.reference = ++compteur;
		this.dateDeValidite = dateDeValidite;
	}

	public Devis(Client client) {
		this(new Date());
		super.setClient(client);
	}
	
	public Devis(Date dateDeValidite, Client client) {
		this(dateDeValidite);
		super.setClient(client);
	}

	public Date getDateDeValidite() {
		return dateDeValidite;
	}

	public void setDateDeValidite(Date dateDeValidite) {
		this.dateDeValidite = dateDeValidite;
	}

	public Long getReference() {
		return reference;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Devis [dateDeValidite=" + dateDeValidite + ", reference=" + reference + ", total=" + getTotal() + ", getClient()=" + getClient()
				+ ", getLignes()=" + getLignes() + ", getDateDeCreation()=" + getDateDeCreation() + "]";
	}

}
