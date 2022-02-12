package fr.orsys.gestion_de_devis_et_factures.business;

import java.util.Date;

public class Facture extends Document {

	private Date dateDEcheance;
	private Long numero;
	// Variable de classe
	private static Long compteur = 0L;
	
	public Facture(Date dateDEcheance) {
		// On invoque le constructeur par défaut de la classe mère (Document)
		super();
		this.numero = ++compteur;
		this.dateDEcheance = dateDEcheance;
	}

	public Facture(Date dateDEcheance, Client client) {
		this(dateDEcheance);
		super.setClient(client);
	}

	public Date getDateDEcheance() {
		return dateDEcheance;
	}
	public void setDateDEcheance(Date dateDEcheance) {
		this.dateDEcheance = dateDEcheance;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Facture [dateDEcheance=" + dateDEcheance + ", numero=" + numero + ", total=" + getTotal() + ", getClient()=" + getClient()
				+ ", getLignes()=" + getLignes() + ", getDateDeCreation()=" + getDateDeCreation() + "]";
	}

	
}
